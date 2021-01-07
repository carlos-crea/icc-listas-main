/* -------------------------------------------------------------------
 * Pelicula.java
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

/**
 * Clase para representar una Pelicula.
 * @author Manuel Alcantara Juarez 
 * @version 1.1<br>
 *          Noviembre 2020
 */
public class Pelicula {
	String nombre, clasificacion;

	/**  
	* Constructor: inicializa una pelicula.
	 * @param nombre Nombre de la película.
	 * @param clasificacion Clasificación de la película. 
	 */
	public Pelicula(String nombre, String clasificacion) {
		this.nombre = nombre;
		this.clasificacion = clasificacion;
	}

	/** 
	 * Comparador entre dos peliculas, regresa verdadero si ambas peliculas tienen el mismo nombre.
	 * @param obj Objeto a comparar. 
	 * @return Objeto comparado. 
	 */
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Pelicula)) return false;
		// Casteo para checar propiedades
		Pelicula objeto = (Pelicula) obj;
		// checamos unicamente el nombre
		if(objeto.nombre.equals(nombre)) return true;
		return false;
	}		

	/**
	 * Regresa una cadena con el titulo y clasificacion de la pelicula.
	 * @return Objeto pasado a formato String.
	 */
	@Override
	public String toString() {
		return String.format("Titulo: " + nombre + " | Categoría: " + clasificacion);
	}
}