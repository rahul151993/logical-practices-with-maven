package com.logical.practices.examples.impl;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class InsertionSort implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		int[] arr = (int[]) o;
		doSorting(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	
	public int[] doSorting(int[] arr) {
		
		if(arr.length > 1) {
			//outer for loop pointing to the no of passes
			for(int i=1; i<arr.length; i++) {
				int j=i;
				int element = arr[i];
				while(j > 0) {
					if(arr[j-1] > arr[j]) {
						arr[j] = arr[j-1];
						arr[j-1] = element;
					} else {
						break;
					}
					j--;
				}
			}
			
		}
		return arr;
	}
	
}
