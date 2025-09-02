package com.msd.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		Comparator<Integer> comp=new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if(i%10>j%10)
					return 1;
				else
					return -1;
			}
		};
		
		List<Integer> obj = new ArrayList<Integer>();

		obj.add(28);
		obj.add(13);
		obj.add(45);
		obj.add(89);
		obj.add(14);

		Collections.sort(obj,comp);
		
		System.out.println(obj);

		for (int n : obj) {
			System.out.println(n * 2);
		}
	}

}
