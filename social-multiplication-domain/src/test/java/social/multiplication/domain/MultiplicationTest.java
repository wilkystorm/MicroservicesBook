package social.multiplication.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTest {

	@Test
	public void testMultiplicationConstructorAndToString() {
		Multiplication classUnderTest = new Multiplication(2, 2);
		assertEquals(2, classUnderTest.getFactorA());
		assertEquals(2, classUnderTest.getFactorB());
	}
}
