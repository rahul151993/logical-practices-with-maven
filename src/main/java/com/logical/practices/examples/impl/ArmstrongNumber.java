package com.logical.practices.examples.impl;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class ArmstrongNumber implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		int no = (int) o;
		boolean isArmStrongNo = isArmStrong(no);
		System.out.println("ArmStrong Number: "+  isArmStrongNo);
	}
	
	public boolean isArmStrong(int no) {
		int power = (no + "").length();
		int div = no;
		long sum = 0;
		while(div != 0) {
			int reminder = div % 10;
			
			int actualNumber = reminder;
			for(int i=1; i<power; i++) {
				reminder = reminder*actualNumber;
			}
			
			sum = sum + reminder;
			div = div/10;
		}
		
		System.out.println("Given No : " + no + " After multiplying iteself: " + power + " times formed number: " + sum);
		
		if(no == sum)
			return true;
		else
			return false;
	}
}
