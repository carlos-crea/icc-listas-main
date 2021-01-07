package icc.listas;
import java.util.NoSuchElementException;  

public class Lista implements Listable {
    private Nodo cabeza;
    private Object pelicula;
    private int contador; //Detecta los elementos de la lista. 

    /*
     * Construye una lista vacia.
    */ 
    public Lista() {
        cabeza = null;
        pelicula = null;
        contador = 0;
    }

    /*
     * Verifica que la lista no esté vacia. 
     * @return true si la lista es vacia o false si la lista no es vacía).
     */
    public boolean estaVacia() {
        return contador == 0;
    }

    /*
     * Inserta un nuevo nodo al inicio de la lista.
     * @param movie Object que se quiera insertar en la Lista.
     */
    public void insertar(Object movie) {
        cabeza = new Nodo(movie, cabeza);
    }


    /*
     * Busca un objeto en el inventario.
     * @param movie Objeto a buscar en la Lista.
     * @return El objeto encontrado. 
     */
    public Object buscar(Object movie) {
		Nodo poste = cabeza;
	
		if (movie == null) throw new IllegalArgumentException();
        boolean encontrado = false;
        while (poste != null ){
            if (movie == poste.getPelicula())
                encontrado = true;
            else poste = poste.getSiguiente();
        }
        return movie; 
    }

	/*
     * Borra un elemento de la lista, si es que este existe. 
     * @param movie Object que se quiera borrar de la Lista.
     */
    public void borrar(Object movie) {
        if (movie == null) throw new IllegalArgumentException();
        if (cabeza	== null) return; 
        else if (cabeza.getPelicula().equals(movie)) {
            Nodo temp = cabeza;
            cabeza = cabeza.getSiguiente();
            temp.setSiguiente(null); // Limpia
        } else {
            Nodo anterior = cabeza;
			Nodo actual = cabeza.getSiguiente();
			while(actual != null){
				if (actual.getPelicula().equals(movie)){
					anterior.setSiguiente(actual.getSiguiente());
					actual.setSiguiente(null);
					return;
				} else {
					anterior = actual;
					actual = actual.getSiguiente();
				}
			}
		}
		return;
	}
	
	/*
    * Imprime todos nodos de la lista.
    */
    public void imprimir() {
		Nodo aux = cabeza;
        while (aux != null) {
            System.out.println(aux.getPelicula());
            aux = aux.getSiguiente();

        }
    }
	
    /*
     * Borra todos los nodos del inventario, elimina el valor y la referencia a los demas nodos y reinicia el contador.
     */
    public void limpiar() {
        cabeza = null;
        contador = 0;
    }

    
	
    /*
   * Metodo que devuelve el primer elemento de la lista
   * @return Primer elemento almacenado en la lista.
   * @throws NoSuchElementException Se dispara si la lista esta vacia.
   */
  public Object getPrimerElemento() {
    if (!estaVacia())
        return pelicula;
    throw new NoSuchElementException("La lista no tiene elementos");
}
}
