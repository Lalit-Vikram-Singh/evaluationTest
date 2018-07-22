package org.rangde.v1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @Lalit
 */

public class PolynomialTest {

	Polynomial obj = new Polynomial();
	
	@Test
	public void testPolynomial() {
		// evaluate value of 2x3 - 6x2 + 2x - 1 for x = 3
		int[] polyArray = {2, -6, 2, -1};
		int x = 3;
		int result = obj.solvePolyEqTerm(polyArray, x);
		System.out.println("Value of polynomial expression is : "  + result);
		assertTrue(result == 5);
	}
}
