/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

public class DesignFactory2<E> {

	/**
	*Method responsible for creating different data structures. Fulfills the Design Factory model requirement. 
	*@param Precondition No precondition
	*@param Postcondition Returns different types of stacks that inherit from the abstract class List
	*@return List type data structure.
	*
	*/
	public List_1<E> typeList(int entry) {
		//metodo que sirve para crear una unica clase de tipo Lista. Esto se haca implementando el diseño de programacion Factory Design
	    if(entry == 1)
	        return new SinglyLinkedList<E>();
	    if(entry == 2)
	        return new DoublyLinkedList<E>();
	    else 
	        return null;
	    }
}