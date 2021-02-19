
import java.util.List;
import java.util.Scanner;


public class StackList<E> extends Stack_1<E>{

	public DesignFactory2 Factory2 = new DesignFactory2();

  protected List_1<E> data = (List_1<E>) Factory2.typeList(chooseList());

  int option;


	public int chooseList()
	{
    System.out.println("Seleccione implementacion de lista: \n [1] Circular List\n[2] Singly-LinkedList\n[3] Doubly-Linked List");
    option = scanner.nextInt(); 
	}


	public void Push(E element){
	// post: the value is added to the stack
	// will be popped next if no intervening push
		data.add(element);
	}

	public E Pop(){
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
		return data.remove(Size()-1);
	}

	public E Get(){
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
		return data.get(Size() - 1);
	}
	
	public int Size(){
	// post: returns the number of elements in the stack
		return data.size();
	}
  
	public boolean IsEmpty(){
	// post: returns true if and only if the stack is empty
		return Size() == 0;
	}
}