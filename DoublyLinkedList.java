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
	
	/**
    * Constructor de la clase
    */
	public DoublyLinkedList() {
		_start = null;
		_end = null;
		size = 0;
	}
	
	/**
    * Metodo insertar 
	*@param E elemento generico que se almacenara
    * @return boolean que indica si se completo la accion
    */
	public boolean insert(E element) {
		// pre: verify if its the first node or not
   		// post: item is added to List
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

	/**
    * Metodo insertar 
	*@param E elemento generico que se almacenara
    * @return boolean que indica si se completo la accion
    */
	public boolean insertAtEnd(E element) {
		// pre:
   		// post: item is added to List
		return this.insert(element);
	}

	/**
    * Metodo para sacar el articulo mas reciente
    * @return devuelve el item E más reciente que se metio a la lista
    */
	public E removeAtEnd() {
		// pre: lista is not empty
   		// post: most recently pushed item is removed and returned
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

	/**
    * Metodo revisar el articulo mas reciente
    * @return devuelve el item E más reciente que se metio a la lista, sin borrarlo
    */
	public E get() {
		// pre: list is not empty
   		// post: top value (next to be popped) is returned
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

	/**
    * Metodo revisar el tamaño de la lista
    * @return el tamaño de la lista
    */
	public int count() {
		// post: returns the number of elements in the stack
		return size;
	}

	/**
    * Metodo para ver si hay algo en la lista
    * @return boolean si esta vacio o no
    */
	public boolean empty() {
		// post: returns true if and only if the list is empty
		return (size == 0);
	}

}