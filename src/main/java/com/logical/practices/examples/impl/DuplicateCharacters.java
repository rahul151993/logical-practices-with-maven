package com.logical.practices.examples.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class DuplicateCharacters implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		String str = (String) o;
		duplicateCharacters(str);
	}
	
	public Map<Character, Integer> duplicateCharacters(String str) {
		char[] arr = str.toCharArray();
		LinkedHashMap<Character, Integer> duplicateCharacters = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<arr.length; i++) {
			if(duplicateCharacters.containsKey(arr[i])) {
				int count = duplicateCharacters.get(arr[i]);
				duplicateCharacters.put(arr[i], ++count);
			} else {
				duplicateCharacters.put(arr[i], 1);
			}
		}
		
		Set<Character> keys = duplicateCharacters.keySet();
		for(char key: keys) {
			int count = duplicateCharacters.get(key);
			if(count > 1) {
				System.out.println("Character: " + key + " count: " + count);
			}
		}
		
		return duplicateCharacters;
	}
}
