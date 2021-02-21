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
	
	/**
	*Constructor method used to save an element in the form of a double ended node. 
	*@param Precondition No precondition
	*@param Postcondition No postcondition.
	*@return Does not return anything.
	*
	*/
	public DoubleNode(E element) {
		//crea nodo doble que almacena elemento y direccion de nodo anterior y proximo
		next = null;
		prev = null;
		value = element;
	}
}