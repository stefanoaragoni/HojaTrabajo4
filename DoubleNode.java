/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

public class DoubleNode<E> {
	public E value;
	public DoubleNode<E> next;
	public DoubleNode<E> prev;
	
	public DoubleNode(E element) {
		next = null;
		prev = null;
		value = element;
	}
}