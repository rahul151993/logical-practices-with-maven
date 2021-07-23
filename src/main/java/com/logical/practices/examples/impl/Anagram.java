package com.logical.practices.examples.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class Anagram implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		String[] arr = (String[]) o;
		System.out.println("Anagram ?: " + isBothStringsAreAnagram(arr[0], arr[1]));
	}
	
	public Map<Character, Integer> getCharacterOccurance(String str){
		Map<Character, Integer> characterOccurance = new HashMap<Character, Integer>();
		
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			int asciiValue = (int) arr[i];
			if((asciiValue >=65 && asciiValue <=90) || (asciiValue >=97 && asciiValue<=122)) {
				if(characterOccurance.containsKey(arr[i])) {
					int count = characterOccurance.get(arr[i]);
					characterOccurance.put(arr[i], ++count);
				} else {
					characterOccurance.put(arr[i], 1);
				}
			}
		}
		return characterOccurance;
	}
	
	public boolean isBothStringsAreAnagram(String str1, String str2) {
		
		Map<Character, Integer> characterOccuranceOfStr1 = getCharacterOccurance(str1.toLowerCase());
		Map<Character, Integer> characterOccuranceOfStr2 = getCharacterOccurance(str2.toLowerCase());
		
		System.out.println("First String character occurances: " + str1);
		System.out.println(characterOccuranceOfStr1);
		System.out.println("Second String character occurances: " + str2);
		System.out.println(characterOccuranceOfStr2);

		
		if(characterOccuranceOfStr1.size() == characterOccuranceOfStr2.size()) {
			boolean isAnagram = true;
			Set<Character> keys = characterOccuranceOfStr1.keySet();
			for(char key: keys) {
				if(characterOccuranceOfStr1.get(key) != characterOccuranceOfStr2.get(key)) {
					isAnagram = false;
					break;
				}
			}
			
			if(isAnagram == true)
				return true;
			else
				return false;
		} else {
			return false;
		}
	}
}
