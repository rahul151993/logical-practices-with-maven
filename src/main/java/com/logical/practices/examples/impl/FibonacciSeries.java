package com.logical.practices.examples.impl;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class FibonacciSeries implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		int size = (int) o;
		long[] fib = getFibonacciSeries(size);
		for(int i=0; i<fib.length; i++) {
			System.out.print(fib[i] + " ");
		}
	}
	
	
	public long[] getFibonacciSeries(int size) {
		
		int first = 1;
		int second = 1;
		int sum = 0;
		int index = 2;
		long[] fibonacciOutput = new long[size];
		
		if(size > 0) {
			fibonacciOutput[0] = first;
			if(size == 1) {
				return fibonacciOutput;
			}
			fibonacciOutput[1] = second;
			while(index < size) {
				sum = first + second;
				first = second;
				second = sum;
				fibonacciOutput[index] = second;
				index++;
			}
		}
		
		return fibonacciOutput;
	}
}
