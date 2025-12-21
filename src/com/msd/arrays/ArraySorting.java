package com.msd.arrays;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int arr[]= {100,55,77,44,11,9,7,56};
		
		System.out.println("Before Sorting:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println("After Sorting:");
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("\nSecond Highest Num : "+arr[arr.length-2]);
	}

}

