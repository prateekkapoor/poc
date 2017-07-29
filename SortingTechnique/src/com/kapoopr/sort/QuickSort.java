package com.kapoopr.sort;

public class QuickSort {
public static void quickSort(int array[],int low,int high) {
	int i=low;
	int j=high;
	int pivot= array[low+(high-low)/2];
	while(i<=j) {
		while(array[i] < pivot){
			i++;
		}
		while(array[j] >pivot){
			j--;
		}
		if(i<=j){
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;;
		}
		
	}
	if(low<j){
		quickSort(array, low, j);
		
	}
	if(i<high){
		quickSort(array, i, high);
	}
	System.out.println();
	for(int a: array) {
		System.out.print(+a+",");
	}
}
public static void main(String[] args) {
	int array[]= {81,22,48,13,69,93,14,45,58,79,72};
	System.out.println("unsorted array");
	for(int a: array) {
		System.out.print(a+",");
	}
	quickSort(array,0,array.length-1);
	System.out.println();
	System.out.println("sorted array");
	for(int a: array) {
		System.out.print(a+",");
	}

}
}
