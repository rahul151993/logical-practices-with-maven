package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.ArmstrongNumber;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
class ArmstrongNumberTest {
	
	@Autowired
	private ArmstrongNumber armstrongNumber;
	
//	@BeforeEach
//	public void init() {
//		this.armstrongNumber = new ArmstrongNumber();
//	}
	
	@Test
	public void armstrongNumberTest1() {
		System.out.println("Enter no to check armstrong numbers");
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		boolean flag = this.armstrongNumber.isArmStrong(no);
		assertEquals(true, flag);
	}
}
