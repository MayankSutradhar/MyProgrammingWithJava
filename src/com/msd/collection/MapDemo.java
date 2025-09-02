package com.msd.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> std=new HashMap<String, Integer>();
		
		std.put("Virat", 55);
		std.put("Sachin", 59);
		std.put("Mayank", 75);
		std.put("Rohit", 45);
		std.put("Rahul", 25);
		std.put("Sachin", 10);
		
		System.out.println(std);
		System.out.println("Key:"+std.keySet());
		System.out.println("Values:"+std.values());
		std.replace("Sachin", 77);
		
		for(String key:std.keySet()) {
			System.out.println(key+":"+std.get(key));
		}
		
		System.out.println("--------------------------");
		std.remove("Sachin");
		for(String key:std.keySet()) {
			System.out.println(key+":"+std.get(key));
		}
		
		System.out.println("--------------Using Hashtable------------");
		
		Map<String, Integer> std1=new Hashtable<String, Integer>();
		
		std1.put("Virat", 55);
		std1.put("Sachin", 59);
		std1.put("Mayank", 75);
		std1.put("Rohit", 45);
		std1.put("Rahul", 25);
		std1.put("Sachin", 10);
		
		System.out.println(std1);
		System.out.println("Key:"+std1.keySet());
		System.out.println("Values:"+std1.values());
		std1.replace("Sachin", 77);
		
		for(String key:std1.keySet()) {
			System.out.println(key+":"+std1.get(key));
		}
		
		System.out.println("--------------------------");
		std1.remove("Sachin");
		for(String key:std1.keySet()) {
			System.out.println(key+":"+std1.get(key));
		}
	}

}
