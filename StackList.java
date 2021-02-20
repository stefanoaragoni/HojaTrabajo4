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

  Scanner scanner = new Scanner(System.in);
	public DesignFactory2 Factory2 = new DesignFactory2();

  protected List_1<E> data = (List_1<E>) Factory2.typeList(chooseList());

  int option;


	public int chooseList()
	{
    System.out.println("\n\nSeleccione implementacion de lista:\n[1] Singly-LinkedList\n[2] Doubly-Linked List");
    option = scanner.nextInt(); 
    return option;
	}


	public void push(E element){
	// post: the value is added to the stack
	// will be popped next if no intervening push
		data.insertAtEnd(element);
	}

	public E pop(){
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
		return data.removeAtEnd();
	}

	public E peek(){
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
		return data.get();
	}
	
	public int size(){
	// post: returns the number of elements in the stack
		return data.count();
	}
  
	public boolean empty(){
	// post: returns true if and only if the stack is empty
		return data.empty();
	}
}