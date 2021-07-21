package com.logical.practices.examples.impl;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class RemoveSpecificCharacters implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		String[] arr = (String[]) o;
		String str = arr[0];
		String mode = arr[1];
		
		if("U".equalsIgnoreCase(mode))
			System.out.println(removeUpperCase(str));
		else if("L".equalsIgnoreCase(mode))
			System.out.println(removeLowerCase(str));
		else if("SC".equalsIgnoreCase(mode))
			System.out.println(removeSpecialCharacters(str));
		else if("A".equalsIgnoreCase(mode))
			System.out.println(removeAlphabets(str));
		else if("D".equalsIgnoreCase(mode))
			System.out.println(removeDigits(str));
		else
			System.out.println("Don't do anything!");
	}
	
	public String removeUpperCase(String str) {
		
		StringBuffer br = new StringBuffer();
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			int asciiValue = (int)arr[i];
			if(asciiValue >=65 && asciiValue<=90) {
				continue;
			} else {
				br.append(arr[i]);
			}
		}
		return br.toString();
	}
	
	public String removeLowerCase(String str) {
		
		StringBuffer br = new StringBuffer();
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			int asciiValue = (int)arr[i];
			if(asciiValue >=97 && asciiValue<=122) {
				continue;
			} else {
				br.append(arr[i]);
			}
		}
		return br.toString();
	}
	
	public String removeSpecialCharacters(String str) {
		
		StringBuffer br = new StringBuffer();
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			int asciiValue = (int)arr[i];
			if((asciiValue >=32 && asciiValue<=47) || (asciiValue >=58 && asciiValue<=64) || (asciiValue >=91 && asciiValue<=96) || (asciiValue >=123 && asciiValue<=126)) {
				continue;
			} else {
				br.append(arr[i]);
			}
		}
		return br.toString();

	}
	
	public String removeAlphabets(String str) {
		
		StringBuffer br = new StringBuffer();
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			int asciiValue = (int)arr[i];
			if((asciiValue >=65 && asciiValue<=90) || (asciiValue >=97 && asciiValue<=122)) {
				continue;
			} else {
				br.append(arr[i]);
			}
		}
		return br.toString();
	}
	
	public String removeDigits(String str) {
		
		StringBuffer br = new StringBuffer();
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			int asciiValue = (int)arr[i];
			if((asciiValue >=48 && asciiValue<=57)) {
				continue;
			} else {
				br.append(arr[i]);
			}
		}
		return br.toString();
	}
}
