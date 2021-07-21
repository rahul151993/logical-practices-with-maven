package com.logical.practices;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.DuplicateCharacters;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class DuplicateCharactersTest {
	
	@Autowired
	private DuplicateCharacters duplicateCharacters;
	
	@Test
	public void duplicateCharacters() {
		
		Map<Character, Integer> duplicateCharacters = this.duplicateCharacters.duplicateCharacters("ABBCC");
		Map<Character,  Integer> expectedOutput = new LinkedHashMap<Character, Integer>();
		expectedOutput.put('B', 2);
		expectedOutput.put('C', 2);
		
		for(char key: expectedOutput.keySet()) {
			assertEquals(expectedOutput.get(key), duplicateCharacters.get(key));
		}
	}
}
