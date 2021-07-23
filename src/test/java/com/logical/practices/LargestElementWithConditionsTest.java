package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.LargestElementWithConditions;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class LargestElementWithConditionsTest {
	
	@Autowired
	private LargestElementWithConditions lEWC;
	
	@Test
	public void largestElementWithConditionsTest() {
		assertEquals(119, lEWC.largestElement(123, 2));
		assertEquals(3, lEWC.largestElement(5, 4));
		assertEquals(4, lEWC.largestElement(5, 3));
		assertEquals(199, lEWC.largestElement(222, 2));
		assertEquals(49, lEWC.largestElement(54, 5));
		assertEquals(4499, lEWC.largestElement(4582, 5));
		assertEquals(98499, lEWC.largestElement(98512, 5));
		assertEquals(547999, lEWC.largestElement(548624, 8));
	}
	
}
