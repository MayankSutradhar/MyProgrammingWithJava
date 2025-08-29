package com.demo.program;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String data = "sdfgeadfsdflkjlklkjlk";
		String str="geeksforgeeks";
		for(Character ch:str.toCharArray()) {
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println("First non repeating char : "+ch);
				break;
			}
		}
		
		for(Character ch:data.toCharArray()) {
			if(data.indexOf(ch)==data.lastIndexOf(ch)) {
				System.out.println("\nFirst non repeating char : "+ch);
				break;
			}
		}
	}

}
