package com.logical.practices.examples.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class Anagram implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		String[] arr = (String[]) o;
		isAllStringsAreAnagram(arr);
	}
	
	public Map<String, Boolean> isAllStringsAreAnagram(String[] str) {
		Map<String, Boolean> anagramStatus = new HashMap<String, Boolean>();
		
		
		
		System.out.println(anagramStatus);
		return anagramStatus;
	}
}
