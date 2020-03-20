package com.udemy.spring.springcore.innerbeans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/innerbeans/scope/scopeconfig.xml");
		Employee employee1 = (Employee) context.getBean("university");
//		System.out.println("Employee Details "+employee1);
		Employee employee2 = (Employee) context.getBean("university");
//		System.out.println("Employee Details "+employee2);
		
		System.out.println("Hascode of employee1 : "+ employee1.hashCode());
		System.out.println("Hascode of employee2 : "+ employee2.hashCode());
	}
}
