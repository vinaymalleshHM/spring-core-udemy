package com.udemy.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		// ApplicationContext is a parent interface
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println("Hospital Name : " + hospital.getName());
		System.out.println("Hospital Departments List : " + hospital.getDepartments());
		System.out.println("To know Which Class Implemented a List : " + hospital.getDepartments().getClass());
	}
}
