/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

public class DesignFactory<E> {

	public Stack_1<E> typeStack(int entry) {
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