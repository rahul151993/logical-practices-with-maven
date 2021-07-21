package com.logical.practices.examples.impl;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class Patterns implements ILogicalExample{
	
	@Override
	public void run(Object o) {
		int[] arr = (int[]) o;
		int noOfRows = arr[0];
		int type = arr[1];
		printPattern(noOfRows, type);
	}
	
	public void printPattern(int noOfRows, int type) {
		if(type == 1) {
			printPatternType1(noOfRows);
		} else if(type == 2) {
			printPatternType2(noOfRows);
		} else if(type == 3) {
			printPatternType3(noOfRows);
		} else if(type == 4) {
			printPatternType4(noOfRows);
		} else if(type == 5) {
			printPatternType5(noOfRows);
		} else if(type == 6) {
			printPatternType6(noOfRows);
		}
	}
	
	public void printPatternType1(int noOfRows) {
		for(int i = 1; i <= noOfRows; i++) {
			int j=0;
			String str = " ";
			str = str.repeat(noOfRows - i);
			System.out.print(str);
			while(j < i) {
				System.out.print(i + " ");
				j++;
			}
			System.out.println();
		}
	}
	
	public void printPatternType2(int noOfRows) {
		for(int i = 1; i <= noOfRows; i++) {
			int j=0;
			String str = " ";
			str = str.repeat(noOfRows - i);
			System.out.print(str);
			int idx = 1;
			while(j < i) {
				System.out.print(idx + " ");
				j++;
				idx++;
			}
			System.out.println();
		}
	}
	
	public void printPatternType3(int noOfRows) {
		for(int i = 1; i <= noOfRows; i++) {
			int j=0;
			String str = " ";
			str = str.repeat(noOfRows - i);
			System.out.print(str);
			while(j < i) {
				System.out.print("*" + " ");
				j++;
			}
			System.out.println();
		}
	}
	
	public void printPatternType4(int noOfRows) {
		for(int i = 1; i <= noOfRows; i++) {
			String str = " ".repeat(noOfRows-i);
			StringBuffer br = new StringBuffer();
			br.append(str);
			int j=1;
			while(j<i) {
				br.append(j);
				j++;
			}
			while(j>=1) {
				br.append(j);
				j--;
			}
			System.out.println(br.toString());
		}
	}
	
	public void printPatternType5(int noOfRows) {
		for(int i = noOfRows; i >=1; i--) {
			String str = " ".repeat(noOfRows-i);
			StringBuffer br = new StringBuffer();
			br.append(str);
			int j=1;
			while(j<i) {
				br.append(j);
				j++;
			}
			while(j>=1) {
				br.append(j);
				j--;
			}
			System.out.println(br.toString());
		}
	}
	
	public void printPatternType6(int noOfRows) {
		for(int i = 1; i <= noOfRows; i++) {
			String str = " ".repeat(noOfRows-i);
			StringBuffer br = new StringBuffer();
			br.append(str);
			int len = (noOfRows - i) + 1;
			while(len<noOfRows) {
				br.append(len);
				len++;
			}
			while(len>=((noOfRows - i) + 1)) {
				br.append(len);
				len--;
			}
			System.out.println(br.toString());
		}
	}

}
