/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

import java.util.ArrayList;

public class StackArrayList<E> extends Stack_Abs<E>{
	protected ArrayList<E> data;

	/**
    * Metodo constructor
    */
	public StackArrayList(){
	// post: constructs a new, empty stack
		data = new ArrayList<E>();
	}

	/**
    * Metodo para meter al stack
    *
    * @param Dejar meter un item al stacl
    */
	public void push(E element){
	// post: the value is added to the stack
	// will be popped next if no intervening push
		data.add(element);
	}

	 /**
    * Metodo para sacar el articulo mas reciente
    * @return devuelve el item más reciente que se metio en el stack
    */
	public E pop(){
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
		return data.remove(size()-1);
	}

	/**
    * Metodo revisar el articulo mas reciente
    * @return devuelve el item más reciente que se metio en el stack, sin borrarlo
    */
	public E peek(){
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
		return data.get(size() - 1);
	}
	
	/**
    * Metodo revisar el tamaño del stack
    * @return el tamaño del stack
    */
	public int size(){
	// post: returns the number of elements in the stack
		return data.size();
	}
  
	/**
    * Metodo para ver si hay algo en el stack
    * @return boolean si esta vacio o no
    */
	public boolean empty(){
	// post: returns true if and only if the stack is empty
		return size() == 0;
	}
}