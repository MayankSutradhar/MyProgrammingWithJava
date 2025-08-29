package com.msd.demo;

import java.util.Arrays;

public class SecondLargestElement1 {

	public static  int getSecondLargest(int arr[],int total) {
		Arrays.sort(arr);
		return arr[total-2];
	}
	public static void main(String[] args) {
		int arr[]= {2,5,3,1,7,6,8,9,4};
		
		System.out.println("Before sort element:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.println("\nAfter sort element:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nSecond largest element:"+getSecondLargest(arr, 9));
	}

}
