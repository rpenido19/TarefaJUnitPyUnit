package tarefaJUnitPyUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int result = Calculator.add(2, 3);
		assertEquals(5, result);
	}

	@Test
	public void testSub() {
		int result = Calculator.sub(5, 3);
		assertEquals(2, result);
	}

	@Test
	public void testMul() {
		int result = Calculator.mul(4, 6);
		assertEquals(24, result);
	}

	@Test
	public void testDiv() {
		double result = Calculator.div(10, 2);
		assertEquals(5.0, result, 0.0001);

		result = Calculator.div(10, 0);
		assertTrue(Double.isInfinite(result));
	}
}
