package com.msd.demo;

public class CountCharacter {

	public static void main(String[] args) {
		String str="Hello welcome mayank";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("Total number count of string :"+count);
	}

}
