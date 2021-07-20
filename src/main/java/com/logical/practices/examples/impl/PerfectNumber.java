package com.logical.practices.examples.impl;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class PerfectNumber implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		int no = (int) o;
		boolean isPerfectNumber = isPerfectNumber(no);
		System.out.println("Perfect Number: " + isPerfectNumber);
	}

	
	public boolean isPerfectNumber(long no) {
		
		long sum = 0;
		long i=1;
		while(i <= no/2) {
			
			if(no%i == 0) {
				System.out.println("Divisors: " + i);
				sum = sum + i;
			}
			i++;
			
		}
		
		System.out.println("No: " + no + " Perfect numbers sum: " + sum);
		
		if(no == sum)
			return true;
		else
			return false;
	}
}
