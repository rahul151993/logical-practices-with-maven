package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.FibonacciSeries;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class FibonacciSeriesTest {
	
	@Autowired
	private FibonacciSeries fib;
	
//	@BeforeEach
//	public void init() {
//		fib = new FibonacciSeries();
//	}
	
	
	@Test
	public void fibonacciSeriesTest1() {
		Scanner s1 = new Scanner(System.in);
		int size = s1.nextInt();
		long[] fibonacciArrayActual = fib.getFibonacciSeries(size);
		for(int i=0; i<fibonacciArrayActual.length; i++) {
			System.out.println(fibonacciArrayActual[i]);
		}
		long[] fibonacciArrayExpected = new long[] {1, 1, 2, 3, 5};
		assertArrayEquals(fibonacciArrayExpected, fibonacciArrayActual);
	}	
}
