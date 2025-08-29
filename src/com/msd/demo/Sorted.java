package com.msd.demo;

public class Sorted {
	 public static void findFirstAndLast(int arr[], int x)
	    {
	        int n = arr.length;
	        int first = -1, last = -1;
	        for (int i = 0; i < n; i++) {
	            if (x != arr[i])
	                continue;
	            if (first == -1)
	                first = i;
	            last = i;
	        }
	        if (first != -1) {
	            System.out.println("First Occurrence = "+ first);
	            System.out.println("Last Occurrence = " + last);
	        }
	        else
	            System.out.println("Not Found");
	    }
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
		int x = 5;
		findFirstAndLast(arr, x);
		System.out.println("-----------------------------");
		int arr1[] = {1, 3, 5, 5, 5, 5, 7, 123, 125 };
		int x1 = 7;
		findFirstAndLast(arr1, x1);
	}
}
