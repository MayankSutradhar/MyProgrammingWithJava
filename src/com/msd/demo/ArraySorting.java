package com.demo.program;

public class ArraySorting {

	public static void main(String[] args) {
		int arr[]= {100,55,77,44,11,9,7,56};
		int temp=0;
		System.out.print("After Array Sorting=");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("\nSecond Highest Num : "+arr[arr.length-2]);
	}

}
