/* -------------------------------------------------------------------
 * Nodo.java
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
import java.util.Set;

/**
 * Programa base para Listas que guarda un valor y una referencia.
 * @author Manuel Alcantara Juarez
 * @version 1.1<br>
 *          Enero 2021
 */

public class Nodo {
	private Object pelicula;
	private Nodo siguiente;

	/**
	 * Constructor que crea un nuevo Nodo de tipo null.
	 */
	public Nodo() {
		pelicula = null;
		siguiente = null;
	}

	/**
	 * Constructor que crea un nuevo Nodo a partir de dos argumentos.
	 * @param valor Valor que se quiera poner en el nodo.
	 * @param siguiente: representa el siguiente nodo.
	 */
	public Nodo(Object valor, Nodo siguiente) {
		setPelicula(valor);
		setSiguiente(siguiente);
	}

	/**
	 * Setter para Pelicula.
	 * @param o Objeto de tipo Pelicula.
	 */
	public void setPelicula(Object o) {
		pelicula = o;
	}

	/**
	 * Setter para los Nodos.
	 * @param n Nodo en cuestion.
	 */
	public void setSiguiente(Nodo nodo) {
		siguiente = nodo;
	}

	/**
	 * Getter para Pelicula.
	 * @return El objeto Pelicula solicitado.
	 */
	public Object getPelicula() {
		return pelicula;
	}

	/**
	 * Getter para Nodo.
	 * @return Nodo solicitado.
	 */
	public Nodo getSiguiente() {
		return siguiente;
	}

}