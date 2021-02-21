/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

public class DesignFactory<E> {

		/**
		*Method responsible for creating different data structures. Fulfills the Design Factory model requirement. 
		*@param Precondition No precondition
		*@param Postcondition Returns different types of stacks that inherit from the abstract class Stack
		*@return Stack type data structure.
		*
		*/
	public Stack_1<E> typeStack(int entry) {
		//metodo que sirve para crear una unica clase de tipo Stack. Esto se haca implementando el diseño de programacion Factory Design
	    if(entry == 1)
	        return new StackArrayList<E>();
	    if(entry == 2)
	        return new StackVector<E>();
	    if(entry == 3)
	        return new StackList<E>();
	    else 
	        return null;
	    }
}