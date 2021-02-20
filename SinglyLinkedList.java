/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

import java.util.LinkedList;

public class SinglyLinkedList<E> extends List_Abs<E> {

	protected LinkedList<E> core;
	
	public SinglyLinkedList() {
		core = new LinkedList<E>();
	}
	
	@Override
	public boolean insert(E element) {
		return core.add(element);
	}

	@Override
	public boolean insertAt(E element, int index) {
		core.add(index, element);
		return true; //If no issue appear, add the element
	}

	@Override
	public boolean insertAtStart(E element) {
		core.addFirst(element);
		return false;
	}

	@Override
	public boolean insertAtEnd(E element) {
		core.addLast(element);
		return false;
	}

	@Override
	public E removeAt(int index) {
		return core.remove(index);
	}

	@Override
	public E removeAtStart() {
		return core.removeFirst();
	}

	@Override
	public E removeAtEnd() {
		return core.removeLast();
	}

  @Override
	public E get() {
		return core.getLast();
	}

	@Override
	public int count() {
		return core.size();
	}

	@Override
	public boolean empty() {
		return core.isEmpty();
	}

}