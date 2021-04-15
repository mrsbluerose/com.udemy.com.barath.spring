package com.udemy.barath.spring.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class dependencychecktest {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/barath/spring/dependencycheck/dependencycheckconfig.xml");
		Prescription prescription = (Prescription) context.getBean("prescription");
		System.out.println(prescription);
		
	}
	
}
