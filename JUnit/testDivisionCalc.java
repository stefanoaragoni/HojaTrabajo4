/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre testDivisionCalc.java 
*@Lenguaje Java
*/

import static org.junit.Assert.*;

import org.junit.Test;

public class testDivisionCalc {

	@Test
	public void test() {
		Calculadora_1 Calc = new Calculadora_1();
		int result = Calc.division(2,2);
		assertEquals(1,result);
	}

}
