package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.SwapNumberWithoutThirdVariable;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class SwapNumberWithoutThirdVariableTest {
	
	@Autowired
	private SwapNumberWithoutThirdVariable snwtv;
	
//	@BeforeEach
//	public void init() {
//		snwtv = new SwapNumberWithoutThirdVariable();
//	}
	
	@Test
	public void swapNumberWithoutTest1() {
		System.out.println("Enter a");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		System.out.println("Enter b");
		int b = s.nextInt();
		
		snwtv.setA(a);
		snwtv.setB(b);
		
		snwtv.doSwapWithoutExtraVariable();
		
		System.out.println("a: " + snwtv.getA() + " b: " + snwtv.getB());
		
		assertEquals(b, snwtv.getA());
		assertEquals(a, snwtv.getB());
	}
}
