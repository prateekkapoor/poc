package com.kapoopr.sort;

public class BubbleSort {
	public static void  bubbleSort(int arr[]) {
		int temp;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]> arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			System.out.println();
			System.out.println("pass "+ (i+1));
			for(int a: arr) {
				System.out.print(a+",");
			}
		}
		
	}
public static void main(String[] args) {
	int array[]= {81,22,48,13,69,93,14,45,58,79,72};
	System.out.println("unsorted array");
	for(int a: array) {
		System.out.print(a+",");
	}
	bubbleSort(array);
	System.out.println();
	System.out.println("sorted array");
	for(int a: array) {
		System.out.print(+a+",");
	}
}

}
