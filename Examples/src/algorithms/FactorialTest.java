package algorithms;

import static org.junit.Assert.fail;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testFactorial() {
		int result = Factorial.factorial(3);
		if (result != 6) fail("expected result is 6");
	}

}
