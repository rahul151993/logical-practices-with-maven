package com.logical.practices.examples.impl;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class SelectionSort implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		int[] arr = (int[]) o;
		doSorting(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public int[] doSorting(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			
			int smallestNo = arr[i];
			int j = i;
			int smallesNoIndex = i;
			
			while(j < arr.length) {
				if(smallestNo > arr[j]) {
					smallestNo = arr[j];
					smallesNoIndex = j;
				}
				j++;
			}
			
			int temp = arr[i];
			arr[i] = arr[smallesNoIndex];
			arr[smallesNoIndex] = temp;
			
			System.out.println("Pass: " + i + " Fixed Element: " + arr[i]);
		}
		
		return arr;
	}
}
