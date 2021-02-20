/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Autor: Stefano Aragoni, Roberto Vallecillos
*
********************************************************/

public class DoublyLinkedList<E> extends List_Abs<E> {

	private DoubleNode<E> _start;
	private DoubleNode<E> _end;
	private int size;
	
	public DoublyLinkedList() {
		_start = null;
		_end = null;
		size = 0;
	}
	
	@Override
	public boolean insert(E element) {
		DoubleNode<E> newNode = new DoubleNode<E>(element);
		
		if (this.empty()) {
			_start = newNode;
			_end = newNode;
			size++;
		} else {
			_end.next = newNode;
			newNode.prev = _end;
			_end = newNode;
			size++;
		}
		
		return true;
	}

	@Override
	public boolean insertAt(E element, int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertAtStart(E element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertAtEnd(E element) {
		return this.insert(element);
	}

	@Override
	public E removeAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeAtStart() {
		if (empty()) {
			return null;
		} else if (count() == 1) {
			DoubleNode<E> temp = this._start;
			this._start = null;
			this._end = null;
			size--;
			return temp.value;
		} else {
			DoubleNode<E> temp = this._start;
			this._start.next.prev = null;
			this._start = this._start.next;
			size--;
			return temp.value;
		}
		
	}

	@Override
	public E removeAtEnd() {
		if (this.count() == 0)
			return null;
		else if (this.count() == 1) {
			DoubleNode<E> temp = this._start;
			this._start = null;
			this._end = null;
			size--;
			return temp.value;
		} else {
			DoubleNode<E> temp = _end;
			_end.prev.next = null;
			_end = _end.prev;
			size--;
			return temp.value;
		}
	}

  @Override
	public E get() {
		if (this.count() == 0)
			return null;
		else if (this.count() == 1) {
			DoubleNode<E> temp = this._start;
			return temp.value;
		} else {
			DoubleNode<E> temp = _end;
			return temp.value;
		}
	}

	@Override
	public int count() {
		return size;
	}

	@Override
	public boolean empty() {
		return (size == 0);
	}

}