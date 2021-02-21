/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre testSize.java 
*@Lenguaje Java
*/

//prueba 2 de JUnit
import static org.junit.Assert.*;

import org.junit.Test;

public class testSizeSingleList {

	@Test
	public void test() {
		SinglyLinkedList<Integer> Stack = new SinglyLinkedList<Integer>();
		int size = Stack.count();
		assertEquals(0,size);
	}

}
