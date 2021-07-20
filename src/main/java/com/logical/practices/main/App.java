package com.logical.practices.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.logical.practices.examples.impl.ArmstrongNumber;
import com.logical.practices.framework.ILogicalExample;
import com.logical.practices.framework.LogicalExampleConfiguration;

/**
 * Hello world!
 *
 */
public class App
{	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new AnnotationConfigApplicationContext(LogicalExampleConfiguration.class);
//        ILogicalExample logicalExample = (ILogicalExample) ctx.getBean("testExample1ByR");
//        logicalExample.run("Rahul");
    }
}
