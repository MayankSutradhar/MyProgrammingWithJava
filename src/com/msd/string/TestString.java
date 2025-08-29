package com.msd.string;

public class TestString {

	public static void main(String[] args) {
		String str="sachin";
		String str1="mayank";
		String str2="SACHIN";
		
		System.out.println(str.equals(str1));
		System.out.println(str1.equals(str2));
		System.out.println(str.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareToIgnoreCase(str2));
		
		System.out.println(str.length());
	
		String strlen="     mayank   ";
		System.out.println(strlen.trim().length());
	}

}
