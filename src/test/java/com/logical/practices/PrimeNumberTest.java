package com.logical.practices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.logical.practices.examples.impl.PrimeNumber;
import com.logical.practices.framework.LogicalExampleConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = LogicalExampleConfiguration.class)
public class PrimeNumberTest {
	
	@Autowired
	private PrimeNumber primeNumber;
	
//	@BeforeEach
//	public void init() {
//		primeNumber = new PrimeNumber();
//	}
	
	@Test
	public void primeNumberTest1() {
		System.out.println("Enter size for prime numbers");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		s.close();
		List<Long> primeNumbers = this.primeNumber.getPrimeNumbers(size);
		
		System.out.println();
		System.out.println(primeNumbers);
		
		List<Long> expectedPrimeNumbers = new ArrayList<Long>();
		expectedPrimeNumbers.add((long) 2);
		expectedPrimeNumbers.add((long) 3);
		expectedPrimeNumbers.add((long) 5);
		expectedPrimeNumbers.add((long) 7);
//		expectedPrimeNumbers.add((long) 11);
//		expectedPrimeNumbers.add((long) 13);
//		expectedPrimeNumbers.add((long) 17);
//		expectedPrimeNumbers.add((long) 19);
		
		assertEquals(expectedPrimeNumbers.size(), primeNumbers.size());
	}
}
