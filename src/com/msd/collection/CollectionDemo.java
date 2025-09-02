package com.msd.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<Integer> obj=new ArrayList<Integer>();
		
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(3);
		
		System.out.println(obj);
		for(int n:obj) {
			System.out.println(n*2);
		}
	}

}
