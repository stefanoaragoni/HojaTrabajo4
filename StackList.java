/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/


import java.util.List;
import java.util.Scanner;

public class StackList<E> extends Stack_Abs<E>{

	//se llama a FactoryDesign2 para asi cumplir con el tipo de diseño. Regresa estructura de datos basado en listas
	Scanner scanner = new Scanner(System.in);
	public DesignFactory2 Factory2 = new DesignFactory2();

	protected List_1<E> data = (List_1<E>) Factory2.typeList(chooseList());

  	int option;

	/**
    * Metodo que le pregunta al usuario que tipo de implementacion de lista desea usar
    * @return int que representa la opcion escogida
    */
	public int chooseList()
	{
	//post: returns number that represents which data structure will be used
		System.out.println("\n\nSeleccione implementacion de lista:\n[1] Singly-LinkedList\n[2] Doubly-Linked List");
		option = scanner.nextInt(); 
		return option;
	}


	 /**
    * Metodo para meter al stack
    *
    * @param Dejar meter un item al stacl
    */
	public void push(E element){
	// post: the value is added to the stack
	// will be popped next if no intervening push
		data.insertAtEnd(element);
	}

	/**
    * Metodo para sacar el articulo mas reciente
    * @return devuelve el item más reciente que se metio en el stack
    */
	public E pop(){
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
		return data.removeAtEnd();
	}

	/**
    * Metodo revisar el articulo mas reciente
    * @return devuelve el item más reciente que se metio en el stack, sin borrarlo
    */
	public E peek(){
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
		return data.get();
	}
	
	/**
    * Metodo revisar el tamaño del stack
    * @return el tamaño del stack
    */
	public int size(){
	// post: returns the number of elements in the stack
		return data.count();
	}
  
	/**
    * Metodo para ver si hay algo en el stack
    * @return boolean si esta vacio o no
    */
	public boolean empty(){
	// post: returns true if and only if the stack is empty
		return data.empty();
	}
}