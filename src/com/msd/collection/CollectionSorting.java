package com.msd.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

	public static void main(String[] args) {
		List<Integer> obj = new ArrayList<Integer>();

		obj.add(22);
		obj.add(13);
		obj.add(45);
		obj.add(25);
		obj.add(16);
		obj.add(13);

		Collections.sort(obj);
		
		System.out.println(obj);

		for (int n : obj) {
			System.out.println(n * 2);
		}
	}

}
