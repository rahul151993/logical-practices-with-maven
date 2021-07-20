package com.logical.practices.examples.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class PrimeNumber implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		int upto = (int) o;
		List<Long> primeNumbers = getPrimeNumbers(upto);
		System.out.println(primeNumbers);
	}

	
	public List<Long> getPrimeNumbers(int size) {
		
		List<Long> primeNumbers = new ArrayList<Long>();
		
		if(size > 1) {
			for(int i = 1; i <= size;  i++) {
				int j=2;
				boolean isPrime = true;
				while(j < i) {
					if(i%j == 0) {
						isPrime = false;
						break;
					}
					j++;
				}
				if(i != 1 && isPrime) {
					primeNumbers.add((long) i);
				}
			}
		}
		
		return primeNumbers;
	}
}
