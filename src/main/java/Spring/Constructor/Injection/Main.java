package Spring.Constructor.Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
 ApplicationContext context = new ClassPathXmlApplicationContext("Spring/Constructor/Injection/config.xml");
         Person p= (Person)context.getBean("Person");
        
         System.out.println(p);
	}

}
