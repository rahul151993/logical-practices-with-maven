package com.logical.practices.examples.impl;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;


/*
 * Write a java program to find all pairs of elements in the given array 
 * whose sum is equal to a given number. 
 * For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number, 
 * then you have to find all pairs of elements in this array whose sum must be 20. 
 * In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20.
 * 
 * Below logic is implemented with insertionSort, binarySearch.
 * */

@Component
public class ArrayPairs implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		@SuppressWarnings("unchecked")
		Map<Object, Object> data = (Map<Object, Object>) o;
		int[] arr = (int[]) data.get("inputArray");
		int total = (int) data.get("total");
		System.out.println("Pairs are: " + getAllPairs(arr, total));
	}
	
	public int binarySearch(int[] arr, int startIndex, int endIndex,  int element) {
		if(endIndex >= startIndex) {
			
			int mid = startIndex + (endIndex - startIndex)/2;
			System.out.println("Mid: " + mid);
			
			if(arr[mid] == element) {
				return mid;
			}
			
			if(arr[mid] > element) {
				return binarySearch(arr, 0, mid-1, element);
			}
			
			return binarySearch(arr, mid+1, endIndex, element);
			
		}
		return -1;
	}
	
	public int[] sortArrayByInsertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int j=i;
			while(j>0) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				} else {
					break;
				}
				j--;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return arr;
	}
	
	public String getAllPairs(int[] arr, int total) {
		
		sortArrayByInsertionSort(arr);
		System.out.println();
		
		StringBuffer br = new StringBuffer();
		for(int i=0; i<arr.length; i++) {
			int part1 = arr[i];
			if(!br.toString().contains("" + part1)) {
				int part2 = total - part1;
				System.out.println("Par1: "+ part1 + " Part2: " + part2);
				int index = binarySearch(arr, 0, arr.length-1, part2);
				System.out.println("index: " + index);
				if(index > -1) {
					if(br.toString().contains("}")) {
						br.append(",");
					}
					br.append("{" + part1 + ", " + part2 + "}");
				}
			}
		}
		return br.toString();
	}
	
}
