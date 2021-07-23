package com.logical.practices.examples.impl;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

/*
 * 
 * Write a java program to find the largest number ‘L’ less than 
 * a given number ‘N’ which should not contain a given digit ‘D’. 
 * For example, If 145 is the given number and 4 is the given digit, 
 * then you should find the largest number less than 145 such that 
 * it should not contain 4 in it. In this case, 139 will be the answer.
 * 
 * */

@Component
public class LargestElementWithConditions implements ILogicalExample {
	
	@Override
	public void run(Object o) {
		@SuppressWarnings("unchecked")
		Map<Object, Object> data = (Map<Object, Object>) o;
		int upto = (int) data.get("upto");
		int digitNotToInclude = (int) data.get("digitNotToInclude");
		System.out.println("Largest Element: " + largestElement(upto, digitNotToInclude));
	}
	
	public int getLargestElement(int upto, int digitNotToInclude) {
		int maxElement = upto - 1;
		if((maxElement+"").contains((digitNotToInclude+""))) {
			StringBuffer br = new StringBuffer();
			int div = maxElement;
			while(div != 0) {
				int reminder = div%10;
				if(reminder == digitNotToInclude) {
					break;
				}
				br.append(reminder+"");
				div = div/10;
			}
			char[] arr = br.toString().toCharArray();
			if(arr.length > 0) {
				int j = arr.length-1;
				int sum = 0;
				while(j >= 0) {
					sum = sum*10 + Integer.parseInt(""+arr[j]);
					j--;
				}
				sum++;
				maxElement = maxElement - sum;
			} else {
				maxElement = maxElement - 1;
			}
		}
		return maxElement;
	}
	
	public int largestElement(int upto, int digitNotToInclude) {
		int largestElement = getLargestElement(upto, digitNotToInclude);
		System.out.println(largestElement);
		while((largestElement+"").contains(digitNotToInclude+"")) {
			largestElement = getLargestElement(largestElement, digitNotToInclude);
			System.out.println(largestElement);
		}
		
		return largestElement;
	}
}
