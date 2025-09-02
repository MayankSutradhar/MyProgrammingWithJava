package com.msd.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> obj = new HashSet<Integer>();

		obj.add(22);
		obj.add(13);
		obj.add(45);
		obj.add(25);
		obj.add(16);
		obj.add(13);

		System.out.println(obj);

		Iterator<Integer> values=obj.iterator();
		while (values.hasNext()) {
			System.out.println(values.next());
		}
		/*
		 * for (int n : obj) { System.out.println(n * 2); }
		 */
		
		Set<Integer> obj2 = new TreeSet<Integer>();

		obj2.add(22);
		obj2.add(13);
		obj2.add(45);
		obj2.add(25);
		obj2.add(16);
		obj2.add(13);

		System.out.println(obj2);

		Iterator<Integer> values1=obj2.iterator();
		while (values1.hasNext()) {
			System.out.println(values1.next());
		}
		/*
		 * for (int n : obj2) { System.out.println(n * 2); }
		 */
	}

}
