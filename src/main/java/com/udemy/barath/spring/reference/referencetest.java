package com.udemy.barath.spring.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class referencetest {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/barath/spring/reference/referenceconfig.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}
}
