/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre testSize.java 
*@Lenguaje Java
*/

//prueba 2 de JUnit
import static org.junit.Assert.*;

import org.junit.Test;

public class testListFactory {

	@Test
	public void test() {
		StackList<Integer> Stack = new StackList<Integer>();
		int size = Stack.chooseList();
		assertEquals(2,size);
	}

}
