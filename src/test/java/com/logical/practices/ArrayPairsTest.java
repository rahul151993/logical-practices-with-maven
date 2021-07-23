package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.ArrayPairs;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class ArrayPairsTest {
	
	@Autowired
	private ArrayPairs aP;
	
	@Test
	public void arrayPairsTest() {
//		int[] arr = new int[] {4, 6, 5, -10, 8, 5, 20};
//		int[] arr = new int[] {4, -5, 9, 11, 25, 13, 12, 8};
//		int[] arr = new int[] {12, 13, 40, 15, 8, 10, -15};
		int[] arr = new int[] {12, 23, 125, 41, -75, 38, 27, 11};
		String result = aP.getAllPairs(arr, 50);
		System.out.println(result);	
//		String[] expected = new String[] {"4, 6", "5, 5", "-10, 20"};
//		String[] expected = new String[] {"-5, 25", "9, 11", "8, 12"};
//		String[] expected = new String[] {"12, 13", "-15, 40", "10, 15"};
		String[] expected = new String[] {"38, 12", "23, 27", "-75, 125"};
		for(int i=0; i<expected.length; i++) {
			assertTrue(result.contains(expected[i]));
		}
	}
}
