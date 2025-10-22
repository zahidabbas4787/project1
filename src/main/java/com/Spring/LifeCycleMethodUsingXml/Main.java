package com.Spring.LifeCycleMethodUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
  AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/Spring/LifeCycleMethodUsingXml/config.xml");
 
  Samosa s =(Samosa)context.getBean("S1");
  System.out.println(s);
 
 context.registerShutdownHook();
 
	}

}
