package com.msd.string;

public class StringCompare {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3="hello";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
	}

}
