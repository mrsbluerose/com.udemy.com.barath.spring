package com.udemy.barath.spring.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class constructorInjectorTest {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/barath/spring/constructorinjection/constructorinjectionconfig.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}
}
