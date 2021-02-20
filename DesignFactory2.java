/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

public class DesignFactory2<E> {

	public List_1<E> typeList(int entry) {
	    if(entry == 1)
	        return new SinglyLinkedList<E>();
	    if(entry == 2)
	        return new DoublyLinkedList<E>();
	    else 
	        return null;
	    }
}