package org.rangde.v1;

/**
 * @Lalit
 */

public class Polynomial {

	public int solvePolyEqTerm(int polyTerm[], int x)
	{
		int result = polyTerm[0];  
		int sizeofPolyArray = polyTerm.length;
		for (int i=1; i<sizeofPolyArray; i++)  result = result*x + polyTerm[i];
		return result;

	}

	public static void main (String[] args) 
	{
		// evaluate value of 2x3 - 6x2 + 2x - 1 for x = 3
		Polynomial poly = new Polynomial();
		int[] polyArray = {2, -6, 2, -1};
		int x = 3;
		System.out.println("Value of polynomial is : "  + poly.solvePolyEqTerm(polyArray,x));
	}
}
