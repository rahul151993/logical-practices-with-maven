package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.InsertionSort;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class InsertionSortTest {
	
	@Autowired
	private InsertionSort insertionSort;
	
//	@BeforeEach
//	public void init() {
//		this.insertionSort = new InsertionSort();
//	}
	
	@Test
	public void insertionSortTest1() {
		int[] arr = new int[] {189,45,132,68,2};
		int[] expected = new int[] {2, 45, 68, 132, 189};
		insertionSort.doSorting(arr);
		
		System.out.println("After sorting");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		assertArrayEquals(expected, arr);
	}
}
