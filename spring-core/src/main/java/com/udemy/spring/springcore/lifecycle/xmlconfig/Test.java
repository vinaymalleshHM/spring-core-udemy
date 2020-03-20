package com.udemy.spring.springcore.lifecycle.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		// AbstractApplicationContext is a parent interface and it is used to invoke destroy method
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/lifecycle/xmlconfig/xmlconfig.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println("Patient Id : " + patient);
		context.registerShutdownHook();
	}
}
