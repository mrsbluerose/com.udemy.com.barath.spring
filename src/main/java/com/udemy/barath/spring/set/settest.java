package com.udemy.barath.spring.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class settest {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/barath/spring/set/setconfig.xml");
		CarDealer hospital = (CarDealer) context.getBean("dealer");
		System.out.println(hospital.getName());
		System.out.println(hospital.getModels());
	}
}
