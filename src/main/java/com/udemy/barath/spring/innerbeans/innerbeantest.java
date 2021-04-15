package com.udemy.barath.spring.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class innerbeantest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/udemy/barath/spring/innerbeans/innerbeanconfig.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}
}
