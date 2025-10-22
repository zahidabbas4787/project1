package com.Spring.LifeCyclemethod.UsingAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/Spring/LifeCyclemethod/UsingAnnotation/config.xml");

        context.registerShutdownHook();

		Employee e=(Employee) context.getBean("employee");
		 
		System.out.println(e);
	}

}
