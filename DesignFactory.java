

public class DesignFactory<E> {

	public Stack_1<E> typeStack(int entry) {
	    if(entry.equals(1))
	        return new StackArrayList<E>();
	    if(entry.equals(2))
	        return new StackVector<E>();
	    if(entry.equals(3))
	        return new StackList<E>();
	    else 
	        return null;
	    }
}