package com.kapoopr.sort;

public class InsertionSort {
	public static void  insertionSort(int arr[]) {
		int j,i,key;
		int n=arr.length;
		for( i=0;i<n-1;i++) {
			
			j=i;
			key=arr[j+1];
			while(j!=-1 &&arr[j]> key) {
			           arr[j+1]=arr[j];
			           j--;
			}
			arr[j+1]=key;
			
			
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
	insertionSort(array);
	System.out.println();
	System.out.println("sorted array");
	for(int a: array) {
		System.out.print(+a+",");
	}

}
}
