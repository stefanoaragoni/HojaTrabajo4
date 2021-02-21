/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre TestEmpty.java 
*@Lenguaje Java
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class TestEmptyArrayList {

	@Test
	public void test() {
		StackArrayList<Integer> Stack = new StackArrayList<Integer>();
		boolean empty = Stack.empty();
		assertEquals(true,empty);
	}

}
