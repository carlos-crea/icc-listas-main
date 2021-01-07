/* -------------------------------------------------------------------
 * BlockBoster.java
 * version 1.0
 * Copyright (C) 2020  Manuel Alcantara Juarez,
 * Facultad de Ciencias,
 * Universidad Nacional Autonoma de Mexico, Mexico.
 *
 * Esta interfaz es software libre; se puede redistribuir
 * y/o modificar en los terminos establecidos por la
 * Licencia Publica General de GNU tal como fue publicada
 * por la Free Software Foundation en la version 2 o
 * superior. 
 *
 * Esta interfaz es distribuida con la esperanza de que
 * resulte de utilidad, pero SIN GARANTIA ALGUNA; de hecho
 * sin la garantia implicita de COMERCIALIZACION o
 * ADECUACION PARA PROPOSITOS PARTICULARES. Vease la
 * Licencia Publica General de GNU para mayores detalles.
 * -------------------------------------------------------------------
 */
package icc.listas;

import java.util.*;
 
public class BlockBoster {

    /**
     * Menu de la clase Blockbuster, sera todo el texto impreso en pantalla al iniciar el programa.  
     */
    public static void menu() {
        System.out.println("Bienvenido al menu de BlockBoster.");
        System.out.println("Que deseas hacer el día de hoy.");
        System.out.println("1. Agregar una pelicula");
        System.out.println("2. Buscar pelicula");
        System.out.println("3. Borrar pelicula");
        System.out.println("4. Inventario");
        System.out.println("5. Borrar Inventario");
        System.out.println("6. Salir");
    }

    /**
     * Método para leer la película ingresada al sistema.
     * @param sc Scanner usado para leer la información ingresada al sistema. 
     * @return La pelicula ingresada. 
     */
    public static Pelicula leerPelicula(Scanner sc) {
        System.out.println("Ingresa el nombre:");
        sc.nextLine(); // Caracter de salto de linea. Ignorar.
        String nombre = sc.nextLine();
        System.out.println("Ingresa la clasificacion:");
        String clasificacion = sc.nextLine();
        return new Pelicula(nombre, clasificacion);
    }

    /**
     * Método main para BlockBuster
     * @param args Información mandada al método para funcionar. 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        Object p = null;

        Listable lista = new Lista();
        do {
            menu();
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Para AGREGAR una pelicula ingresa los siguientes datos:");
                    p = leerPelicula(sc);
                    lista.insertar(p);
                    System.out.println("Listo, se agrego la pelicula.\n");
                    break;
                case 2:
                    System.out.println("Para BUSCAR una pelicula ingresa los siguientes datos:");
                    Object n = leerPelicula(sc);
                    if (n.equals(p)) {
                        System.out.println("Pelicula Encontrada: " + n.toString() + "\n");
                    } else {
                        System.out.println("No se encontró la pelicula.\n");
                    }
                    break;
                case 3:
                    System.out.println("Para BORRAR una pelicula ingresa los siguientes datos:");
                    p = leerPelicula(sc);
                    lista.borrar(p);
                    System.out.println("Listo, se borro la pelicula si es que existia en el catalogo.\n");
                    break;
                case 4:
                    System.out.println("El inventario es:");
                    lista.imprimir();
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("El inventario fue borrado:");
                    lista.limpiar();
                    System.out.println("\n");
                    break;
                case 6:
                    isRunning = false;
                    System.out.println("Gracias por tu preferencia. Vuelve pronto!\n");
                    break;
                default:
                    System.out.println("Opcion no valida. Vuelve a intentarlo.\n");
            }
        } while (isRunning);
    }
}