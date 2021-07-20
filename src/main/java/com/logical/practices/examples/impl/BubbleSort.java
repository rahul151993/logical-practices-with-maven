package com.logical.practices.examples.impl;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class BubbleSort implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		int[] arr = (int[]) o;
		doSortingUsingBubbleSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public int[] doSortingUsingBubbleSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int j=0, k=1;
			while(k < arr.length) {
				
				if(arr[j] > arr[k]) {
					int temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
				
				j=k;
				k++;
			}
			System.out.println("Pass: [" + i + "] Last Element: " + arr[(k-i)-1]);
		}
		return arr;
	}
}
