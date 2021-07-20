package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.Factorial;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class FactorialTest {
	
	@Autowired
	private Factorial factorial;
	
//	@BeforeEach
//	public void init() {
//		this.factorial = new Factorial();
//	}
	
	@Test
	public void factorialTest1() {
		System.out.println("Enter the number to find factorial");
		Scanner s = new Scanner(System.in);
		long no = s.nextLong();
		long ans = this.factorial.fact(no);
		assertEquals(5040, ans);
	}
}
