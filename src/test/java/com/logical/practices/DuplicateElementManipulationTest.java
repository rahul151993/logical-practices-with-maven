package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.DuplicateElementsManipulation;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class DuplicateElementManipulationTest {
	
	@Autowired
	private DuplicateElementsManipulation dem;
	
//	@BeforeEach
//	public void init() {
//		dem = new DuplicateElementsManipulation();
//	}
	
	@Test
	public void duplicateElementManipulationTest1() {
		int[] arr = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5};
		int[] duplicateRemovedArr = dem.removeDuplicates(arr);
		int[] expectedOne = new int[] {1, 2, 3, 4, 5};
		assertArrayEquals(expectedOne, duplicateRemovedArr);
	}
}
