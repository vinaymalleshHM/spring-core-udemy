package com.udemy.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		// ApplicationContext is a parent interface
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/reftypes/refconfig.xml");
		Student student = (Student) context.getBean("student");
		System.out.println("Student Scores: " + student);
	}
}
