package com.logical.practices.examples.impl;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class Factorial implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		int no = (int) o;
		fact(no);
	}
	
	public long fact(long no) {
		long sum = 1;
		while(no > 0) {
			sum = sum * no;
			no--;
		}
		
		System.out.println("Factorial is: " + sum);
		return sum;
	}
}
