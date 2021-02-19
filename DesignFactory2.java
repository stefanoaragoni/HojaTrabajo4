
public class DesignFactory2<E> {

	public Stack_1<E> typeList(int entry) {
	    if(entry.equals(1))
	        return new CircularList<E>();
	    if(entry.equals(2))
	        return new SinglyLinkedList<E>();
	    if(entry.equals(3))
	        return new DoublyLinkedList<E>();
	    else 
	        return null;
	    }
}