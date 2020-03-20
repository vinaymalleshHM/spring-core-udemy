package com.udemy.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/innerbeans/config.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println("Employee Details "+employee.hashCode());
		Employee employee1 = (Employee) context.getBean("employee");
		System.out.println("Employee Details "+employee1.hashCode());
	}
}
