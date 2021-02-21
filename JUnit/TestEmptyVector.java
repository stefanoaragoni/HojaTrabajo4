/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre TestEmpty.java 
*@Lenguaje Java
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class TestEmptyVector {

	@Test
	public void test() {
		StackVector<Integer> Stack = new StackVector<Integer>();
		Stack.push(1);
		boolean empty = Stack.empty();
		assertEquals(false,empty);
	}

}
