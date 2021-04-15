package com.udemy.barath.spring.lc.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class xmlconfigtest {
	
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/barath/spring/lc/interfaces/xmlconfig.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook(); //had to use parent class on Application Context - AbstractApplicationContext
	}
}
