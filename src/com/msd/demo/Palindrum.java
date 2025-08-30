package com.msd.demo;

public class Palindrum {
	public static void main(String[] args) {
		int num,r,sum=0;
		num=13431;
		int temp=num;
		while(num!=0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		System.out.println("Sum: "+sum);
		if(temp==sum) {
			System.out.println(temp+" is palindrum number.");
		}else {
			System.out.println(temp+" is not palindrum number.");
		}
	}
}
