package com.udemy.barath.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) ctx.getBean("emp"); //get bean name from config.xml
		System.out.println("Employee ID: " + emp.getId());
		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee Email: " + emp.getEmail());
	}

}
