package org.rangde.v1;

import java.util.ArrayList;

import org.junit.Test;
import junit.framework.TestCase;

/**
 * @Lalit
 */

public class FlattenTest extends TestCase {
	
	Flatten obj = new Flatten();
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void testFlatten() {
		//Input List: [[1], 2, [[3, 4], 5], [[[]]], [[[6]]], 7, 8, []]
		ArrayList root = new ArrayList();

		ArrayList first = new ArrayList();
		first.add(1);
		root.add(first);
		root.add(2);

		ArrayList sceond = new ArrayList();
		ArrayList sceond1 = new ArrayList();
		sceond1.add(3);
		sceond1.add(4);
		sceond.add(sceond1);
		sceond.add(5);
		root.add(sceond);

		ArrayList third = new ArrayList();
		ArrayList third1 = new ArrayList();
		ArrayList third11 = new ArrayList();
		third1.add(third11);
		third.add(third1);
		root.add(third);

		ArrayList forth = new ArrayList();
		ArrayList forth1 = new ArrayList();
		ArrayList forth11 = new ArrayList();
		forth11.add(6);
		forth1.add(forth11);
		forth.add(forth1);
		root.add(forth);

		root.add(7);
		root.add(8);

		ArrayList fifth = new ArrayList();
		root.add(fifth);
		
		ArrayList flatenArray = obj.getFlattenList(root);
		
		System.out.println( root);
		
		System.out.println( flatenArray);
		
		assertTrue(flatenArray.size() == 8);
	}

}
