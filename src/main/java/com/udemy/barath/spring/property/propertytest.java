package com.udemy.barath.spring.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class propertytest {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/barath/spring/property/propertyconfig.xml");
		Language language = (Language) context.getBean("language");
		System.out.println(language);
	}
}
