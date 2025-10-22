package com.app.zahid.Dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext(" com/app/zahid/Dependency/config.xml");
       Student Student1=(Student) context.getBean("Student1");
       System.out.println(Student1);
        
    }
}
