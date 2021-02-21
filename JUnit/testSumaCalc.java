/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre testSumaCalc.java 
*@Lenguaje Java
*/

import static org.junit.Assert.*;

import org.junit.Test;

public class testSumaCalc {

	@Test
	public void test() {
		Calculadora_1 Calc = new Calculadora_1();
		int result = Calc.suma(1,2);
		assertEquals(3,result);
	}

}
