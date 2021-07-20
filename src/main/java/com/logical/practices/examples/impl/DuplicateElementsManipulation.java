package com.logical.practices.examples.impl;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class DuplicateElementsManipulation implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		int[] arr = (int[]) o;
		arr = removeDuplicates(arr);
	}

	
	public int[] removeDuplicates(int[] arr) {

		StringBuffer br = new StringBuffer();
		for(int i=0; i<arr.length; i++) {
			if(!br.toString().contains(arr[i]+"")) {
				br.append(arr[i]+"");
			}
		}
		
		char[] str = br.toString().toCharArray();
		int[] removedDuplicate = new int[str.length];
		
		for(int i=0; i<removedDuplicate.length; i++) {
			removedDuplicate[i] = Integer.parseInt(str[i]+"");
			System.out.print(removedDuplicate[i] + " ");
		}
		
		return removedDuplicate;
	}
}
