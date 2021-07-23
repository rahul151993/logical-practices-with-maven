package com.logical.practices.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        ApplicationContext ctx = new AnnotationConfigApplicationContext(LogicalExampleConfiguration.class);
        ILogicalExample logicalExample = (ILogicalExample) ctx.getBean("continuousSubArray");
        
        Map<Object, Object> data = new HashMap<Object, Object>();
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 1, 1, 4};
        data.put("inputArray", arr);
        data.put("total", 6);
        
        logicalExample.run(data);
        ((ConfigurableApplicationContext)ctx).close();
    }
}
