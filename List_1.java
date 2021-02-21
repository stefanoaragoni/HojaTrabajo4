/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

import java.util.*;

public interface List_1<E> {

	/**
    * Metodo insertar 
	*@param E elemento generico que se almacenara
    * @return boolean que indica si se completo la accion
    */
	public boolean insert(E element);
	// pre: verify if its the first node or not
   	// post: item is added to List

	/**
    * Metodo revisar el articulo mas reciente
    * @return devuelve el item E más reciente que se metio a la lista, sin borrarlo
    */
  	public E get();
	// pre: list is not empty
   	// post: top value (next to be popped) is returned

	/**
    * Metodo para sacar el articulo mas reciente
    * @return devuelve el item E más reciente que se metio a la lista
    */
	public E removeAtEnd();
	// pre: lista is not empty
   	// post: most recently pushed item is removed and returned

	/**
    * Metodo para almacenar un elemento de ultimo
    * @return devuelve el item E más reciente que se metio a la lista, sin borrarlo
    */
	public boolean insertAtEnd(E element);
	// pre: list is not empty
   	// post: top value (next to be popped) is returned
	   
	/**
    * Metodo revisar el tamaño de la lista
    * @return el tamaño de la lista
    */
	public int count();
	// post: returns the number of elements in the stack
	
	/**
    * Metodo para ver si hay algo en la lista
    * @return boolean si esta vacio o no
    */
	public boolean empty();
	// post: returns true if and only if the list is empty


}