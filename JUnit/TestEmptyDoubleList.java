/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre TestEmpty.java 
*@Lenguaje Java
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class TestEmptyDoubleList {

	@Test
	public void test() {
		DoublyLinkedList<Integer> Stack = new DoublyLinkedList<Integer>();
		boolean empty = Stack.empty();
		assertEquals(true,empty);
	}

}
