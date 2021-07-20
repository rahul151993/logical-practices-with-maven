package com.logical.practices.examples.impl;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class ReversePalindrom implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		try {
			String str = (String) o;
			System.out.println("Is Palindrom?: " + isPalindrom(str));
		} catch(Exception e) {			
			long no = (long) o;
			System.out.println("Is Palindrom?: " + isPalindrom(no));

		}
	}
	
	public boolean isPalindrom(String str) {
		if(str.length() == 0) {
			
			return true;
			
		} else {
			
			char[] arr = str.toCharArray();
			StringBuffer br = new StringBuffer();
			for(int i=arr.length-1; i>=0; i--) {
				br.append(arr[i]);
			}
			
			String formedString = br.toString();
			System.out.println("Given String: " + str + " Formed String: " + formedString);
			
			if(str.equals(formedString))
				return true;
			else
				return false;
		}
	}
	
	public boolean isPalindrom(long no) {
		long number = no;
		long sum = 0;
		
		if(number < 10) {
			sum = number;
		}
		
		while(number != 0) {			
			long reminder = number % 10;
			number = number/10;
			sum = (sum * 10) + reminder;
		}
		
		System.out.println("Given No: " + no + " Formed No: " + sum);
		
		if(no == sum)
			return true;
		else
			return false;
	}
}
