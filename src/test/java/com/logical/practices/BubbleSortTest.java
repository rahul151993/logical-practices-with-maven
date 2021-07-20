package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.BubbleSort;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class BubbleSortTest {
	
	@Autowired
	private BubbleSort bSort;
	
//	@BeforeEach
//	public void init() {
//		bSort = new BubbleSort();
//	}
	
	@Test
	public void bubbleSortTest1() {
		int[] arr = new int[] {1, 9, 2, 3, 7};
		bSort.doSortingUsingBubbleSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		int[] expectedOne = new int[] {1, 2, 3, 7, 9};
		assertArrayEquals(expectedOne, arr);
	}
	
}
