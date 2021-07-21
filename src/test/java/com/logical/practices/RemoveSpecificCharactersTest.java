package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.RemoveSpecificCharacters;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class RemoveSpecificCharactersTest {
	
	@Autowired
	private RemoveSpecificCharacters rsc;
	
	@Test
	public void removeSpecialCharactersTest() {
		String str = "!@Rahul$#%@Jadhav&*()_+:<>?/*151993";
		String result = rsc.removeSpecialCharacters(str);
		assertEquals("RahulJadhav151993", result);
	}
	
	@Test
	public void removeUpperCaseTest() {
		String str = "Rahul.Jadhav@151993";
		String result = rsc.removeUpperCase(str);
		assertEquals("ahul.adhav@151993", result);
	}
	
	@Test
	public void removeLowerCaseTest() {
		String str = "Rahul.Jadhav@151993";
		String result = rsc.removeLowerCase(str);
		assertEquals("R.J@151993", result);
	}
	
	@Test
	public void removeAlphabetsTest() {
		String str = "Rahul.Jadhav@151993";
		String result = rsc.removeAlphabets(str);
		assertEquals(".@151993", result);
	}
	
	@Test
	public void removeDigitTest() {
		String str = "Rahul.Jadhav@151993";
		String result = rsc.removeDigits(str);
		assertEquals("Rahul.Jadhav@", result);
	}
}
