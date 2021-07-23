package com.logical.practices.examples.impl;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class SubLargest implements ILogicalExample{
	@Override
	public void run(Object o) {
		
		@SuppressWarnings("unchecked")
		Map<Object, Object> data = (Map<Object, Object>) o;
		
		int[] arr = (int[]) data.get("inputArray");
		int largestPos = (int) data.get("largestPosition");
		int largestElement = largestElementByPosition(arr, largestPos);
		
		System.out.println("\nLargest element is: " + largestElement);
	}
	
	public int largestElementByPosition(int[] arr, int largestPos) {
		
		for(int i=0; i<arr.length-1; i++) {
			int j = i;
			int smallestElementIndex = j;
			while(j<arr.length) {
				if(arr[smallestElementIndex] > arr[j]) {
					smallestElementIndex = j;
				}
				j++;
			}
			System.out.println("smallest element of pass " + i + " : " + arr[smallestElementIndex]);
			int temp = arr[i];
			arr[i] = arr[smallestElementIndex];
			arr[smallestElementIndex] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		return arr[arr.length - largestPos];
	}
}
