package com.msd.demo;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] arr= {11,22,4,3,33,40,5};
		int temp=0;
		int size=arr.length;
		System.out.println("Before sorting element:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");	
		}
		
		System.out.println("\nAfter sorting element:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
			System.out.print(arr[i]+",");
		}
			
		System.out.print("\nSecond largest element:"+arr[size-2]);
	
	}

}
