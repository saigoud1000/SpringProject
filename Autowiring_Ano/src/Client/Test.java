package Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("resourses/spring.xml");
		Car c = (Car) app.getBean("c"); 
		c.PrintData();

	}

}
