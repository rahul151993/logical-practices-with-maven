package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.SubLargest;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class SubLargestTest {
	
	@Autowired
	private SubLargest subLargest;
	
	@Test
	public void subLargestTest() {
		int[] arr = new int[] {103, 22, 18, 39, 57, 45, 89};
		assertEquals(45, subLargest.largestElementByPosition(arr, 4));
		assertEquals(103, subLargest.largestElementByPosition(arr, 1));
		assertNotEquals(103, subLargest.largestElementByPosition(arr, 3));
		assertEquals(57, subLargest.largestElementByPosition(arr, 3));
	}
}
