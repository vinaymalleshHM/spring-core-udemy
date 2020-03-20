package com.udemy.spring.springcore.propertyplaceholder.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/propertyplaceholder/assignment/config.xml");
		MyDAO dao = (MyDAO) context.getBean("myDAO");
		System.out.println("mydao : " + dao);
	}
}
