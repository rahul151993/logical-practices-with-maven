package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		assertEquals(true, this.armstrongNumber.isArmStrong(153));
		assertEquals(true, this.armstrongNumber.isArmStrong(371));
		assertEquals(true, this.armstrongNumber.isArmStrong(9474));
		assertEquals(true, this.armstrongNumber.isArmStrong(54748));
		assertEquals(true, this.armstrongNumber.isArmStrong(407));
		assertEquals(false, this.armstrongNumber.isArmStrong(1674));
	}
}
