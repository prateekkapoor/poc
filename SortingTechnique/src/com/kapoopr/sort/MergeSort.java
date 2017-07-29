package com.kapoopr.sort;

public class MergeSort {
	public static void  mergeSort(int arr[],int low,int high) {
		if (low < high) {
		      // Get the index of the element which is in the middle
		      int middle = low + (high - low) / 2;
		      // Sort the left side of the array
		      mergeSort(arr,low, middle);
		      // Sort the right side of the array
		      mergeSort(arr,middle + 1, high);
		      // Combine them both
		      merge(arr,low, middle, high);
		}	
	}
	public static void merge(int numbers[],int low,int middle,int high) {
		int helper[]=new int[11];
		// Copy both parts into the helper array
	    for (int i = low; i <= high; i++) {
	      helper[i] = numbers[i];
	    }

	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    // Copy the smallest values from either the left or the right side back
	    // to the original array
	    while (i <= middle && j <= high) {
	      if (helper[i] <= helper[j]) {
	        numbers[k] = helper[i];
	        i++;
	      } else {
	        numbers[k] = helper[j];
	        j++;
	      }
	      k++;
	    }
	    // Copy the rest of the left side of the array into the target array
	    while (i <= middle) {
	      numbers[k] = helper[i];
	      k++;
	      i++;
	    }
	}
	public static void main(String[] args) {
		int array[]= {81,22,48,13,69,93,14,45,58,79,72};
		System.out.println("unsorted array");
		for(int a: array) {
			System.out.print(a+",");
		}
		mergeSort(array, 0, array.length-1);
		System.out.println();
		System.out.println("sorted array");
		for(int a: array) {
			System.out.print(a+",");
		}

	}

}
