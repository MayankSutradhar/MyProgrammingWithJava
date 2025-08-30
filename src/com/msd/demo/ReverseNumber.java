package com.msd.demo;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=43678956;
		int rem,sum = 0;
		while(num!=0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println("Reverse = "+sum);
	}

}
