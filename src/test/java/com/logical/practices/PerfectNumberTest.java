package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.PerfectNumber;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class PerfectNumberTest {
	
	@Autowired
	PerfectNumber pNo;
	
//	@BeforeEach
//	public void init() {
//		 pNo = new PerfectNumber();
//	}
	
	@Test
	public void perfectNumberTest1() {
		System.out.println("Enter the number to check perfect number logic");
		Scanner s = new Scanner(System.in);
		long no = s.nextLong();
		s.close();
		boolean flag = pNo.isPerfectNumber(no);
		assertEquals(true, flag);
	}
}
