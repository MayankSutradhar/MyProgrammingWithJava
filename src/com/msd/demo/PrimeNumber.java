package com.msd.demo;

public class PrimeNumber {

	public static void main(String[] args) {
		int num,flag=0;
		int number=19;
		num=number/2;
		if(number==0 || number==1) {
			System.out.println(number+" is not prime number");
		}
		else {
			for(int i=2;i<=num;i++) {
				if(number%i==0) {
					System.out.println(number+" is not prime number");
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println(number+" is prime number");
		}
	}

}
