/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre testSize.java 
*@Lenguaje Java
*/

//prueba 2 de JUnit
import static org.junit.Assert.*;

import org.junit.Test;

public class testSizeArrayList {

	@Test
	public void test() {
		StackArrayList<Integer> Stack = new StackArrayList<Integer>();
		int size = Stack.size();
		assertEquals(0,size);
	}

}
