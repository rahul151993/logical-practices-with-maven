package com.logical.practices.examples.impl;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class SwapNumberWithoutThirdVariable implements ILogicalExample{
	
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public void doSwapWithoutExtraVariable() {
		//Step1: find difference and store in a
		a = a - b;
		
		//Step2: add a value in b and stored it in b
		b = b + a;
		
		//Step3: subtract the value of a from b and store it in a
		a = b - a;
	}
	
	@Override
	public void run(Object o) {
		int[] arr = (int[]) o;
		a = arr[0];
		b = arr[1];
		System.out.println("Before Swap!");
		System.out.println("a: " + a + " b: " + b);
		doSwapWithoutExtraVariable();
		System.out.println("After Swap!");
		System.out.println("a: " + a + " b: " + b);
	}
	
}
