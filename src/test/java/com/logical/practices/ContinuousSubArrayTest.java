package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.ContinuousSubArray;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class ContinuousSubArrayTest {
	
	@Autowired
	private ContinuousSubArray cSA;
	
	@Test
	public void continuousSubArrayTest() {
		int[] arr = new int[] {15, 51, 7, 81, 5, 11, 25};
		List<int[]> subArraysList = cSA.findContinuousArray(arr, 41);
		int[][] expected = new int[][] {{5 , 11, 25}};
				
		for(int i=0; i<expected.length; i++) {
			int[] result = subArraysList.get(i);
			for(int j=0; j<expected[i].length; j++) {
				assertEquals(expected[i][j], result[j]);
			}
		}
	}
}
