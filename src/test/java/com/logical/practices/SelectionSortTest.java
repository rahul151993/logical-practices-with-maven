package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.SelectionSort;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class SelectionSortTest {
	
	@Autowired
	private SelectionSort selectionSort;
	
//	@BeforeEach
//	public void init() {
//		this.selectionSort = new SelectionSort();
//	}
	
	@Test
	public void selectionSortTest1() {
		int[] arr = new int[] {5, 1, 4, 2, 3};
		this.selectionSort.doSorting(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		int[] expectedOne = new int[] {1, 2, 3, 4, 5};
		assertArrayEquals(expectedOne, arr);
	}
}
