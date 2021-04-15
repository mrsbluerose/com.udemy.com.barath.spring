package com.udemy.barath.spring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class assignmenttest {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/barath/spring/assignment/assignmentconfig.xml");
		ShoppingCart cart = (ShoppingCart) context.getBean("cart");
		System.out.println(cart);
	}
}
