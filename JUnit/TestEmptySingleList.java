/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre TestEmpty.java 
*@Lenguaje Java
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class TestEmptySingleList {

	@Test
	public void test() {
		SinglyLinkedList<Integer> Stack = new SinglyLinkedList<Integer>();
		boolean empty = Stack.empty();
		assertEquals(true,empty);
	}

}
