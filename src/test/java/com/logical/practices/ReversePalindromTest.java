package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.ReversePalindrom;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class ReversePalindromTest {
	
	@Autowired
	private ReversePalindrom reversePalindrome;
	
//	@BeforeEach
//	public void init() {
//		this.reversePalindrome = new ReversePalindrom();
//	}
	
	@Test
	public void reversePalindromeTest1() {
		System.out.println("Enter the String: ");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		boolean flag = this.reversePalindrome.isPalindrom(str);
		assertEquals(true, flag);
	}
	
	@Test
	public void reversePalindromeTest2() {
		System.out.println("Enter the No: ");
		Scanner s = new Scanner(System.in);
		long no = s.nextLong();
		boolean flag = this.reversePalindrome.isPalindrom(no);
		assertEquals(true, flag);
	}
}
