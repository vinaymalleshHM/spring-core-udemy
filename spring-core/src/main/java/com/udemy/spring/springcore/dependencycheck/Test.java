package com.udemy.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {

		// ApplicationContext is a parent interface 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/dependencycheck/config.xml");
		Prescription prescription = (Prescription) context.getBean("prescription");
		System.out.println("Prescription details : " + prescription);
	}
}
