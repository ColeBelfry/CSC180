import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author cbelfry
 *
 */
class CalculatorTest {

	@Test
	void testAdd() {
		Calculator clsCalc = new Calculator();
		if (clsCalc.add(1,5) !=6) {
		//fail("Not yet implemented");
		}
	}
	
	@Test
	void testSubtract() {
		assertEquals(Calculator.subtract(7,5) ,2); 
	}
	
	@Test
	void testDivide() {
		assertEquals(Calculator.divide(6,2) ,3); 
	}
	
	@Test
	void testMultiply() {
		assertEquals(Calculator.multiply(2,5) ,10); 
	}
	
	
	
	

}
