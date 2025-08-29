package com.demo.program;

public class Armstrong {

	public static void main(String[] args) {
		int r,num,sum=0;
		num=1634;
		int temp=num;
		while(num>0) {
			r=num%10;
			sum=(r*r*r*r)+sum;
			num=num/10;
		}
		System.out.println("Sum: "+sum);
		if(temp==sum) {
			System.out.println(temp+" is armstrong number.");
		}else {
			System.out.println(temp+" is not armstrong number.");
		}
	}

}
