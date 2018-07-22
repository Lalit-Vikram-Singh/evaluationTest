package org.rangde.v1;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

/**
 * @Lalit
 */

public class Flatten 
{

	@SuppressWarnings("rawtypes")
	ArrayList genralList = new ArrayList();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ArrayList getFlattenList(ArrayList input) {

		ArrayList lowestObjectList = new ArrayList();
		for(int i=0; i<input.size(); i++) {
			Class identity = input.get(i).getClass();
			if(StringUtils.equalsIgnoreCase(identity.getName(), "java.util.ArrayList")) {
				ArrayList temp2 = (ArrayList) input.get(i);
				ArrayList flatList = solveRecsiveList(temp2,true);
				lowestObjectList.addAll(flatList);
			}else {
				lowestObjectList.add(input.get(i));
			}
		}
		return lowestObjectList;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ArrayList solveRecsiveList(ArrayList input2,Boolean flag) {
		if(flag) {
			genralList.clear();
		}
		for(int i=0; i<input2.size(); i++) {
			Class identity2 = input2.get(i).getClass();
			if(StringUtils.equalsIgnoreCase(identity2.getName(), "java.util.ArrayList")) {
				ArrayList temp = (ArrayList) input2.get(i);
				solveRecsiveList(temp, false);
			}else {
				genralList.add(input2.get(i));
			}
		}
		return genralList;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main( String[] args ) throws ClassNotFoundException
	{
		//Input List: [[1], 2, [[3, 4], 5], [[[]]], [[[6]]], 7, 8, []]
		Flatten ft = new  Flatten();

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

		System.out.println(root);
		System.out.println( ft.getFlattenList(root));


	}



}
