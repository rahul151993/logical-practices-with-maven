package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.Anagram;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class AnagramTest {
	
	@Autowired
	private Anagram anagram;
	
	@Test
	public void anagramTest1() {
		assertEquals(true, anagram.isBothStringsAreAnagram("Mother In Law", "Hitler Woman"));
		assertEquals(true, anagram.isBothStringsAreAnagram("keEp", "peek"));
		assertEquals(true, anagram.isBothStringsAreAnagram("SiLeNt CAT", "LisTen AcT"));
		assertEquals(true, anagram.isBothStringsAreAnagram("Debit Card", "Bad Credit"));
		assertEquals(true, anagram.isBothStringsAreAnagram("School MASTER", "The ClassROOM"));
		assertEquals(true, anagram.isBothStringsAreAnagram("DORMITORY", "Dirty Room"));
		assertEquals(true, anagram.isBothStringsAreAnagram("ASTRONOMERS", "NO MORE STARS"));
		assertEquals(false, anagram.isBothStringsAreAnagram("Toss", "Shot"));
		assertEquals(false, anagram.isBothStringsAreAnagram("joy", "enjoy"));
	}
}
