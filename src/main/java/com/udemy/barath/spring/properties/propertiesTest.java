package com.udemy.barath.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class propertiesTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/barath/spring/properties/propertiesconfig.xml");
		MyDAO dao = (MyDAO) context.getBean("MyDAO");
		System.out.println(dao);
	}

}
