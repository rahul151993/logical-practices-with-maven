package com.logical.practices.examples.impl;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class TestExample1ByR implements ILogicalExample{
	@Override
	public void run(Object o) {
		System.out.println("Hello " + o + " !");
	}
}
