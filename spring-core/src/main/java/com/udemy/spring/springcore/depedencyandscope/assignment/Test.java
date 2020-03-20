package com.udemy.spring.springcore.depedencyandscope.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {

		// ApplicationContext is a parent interface 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/depedencyandscope/assignment/config.xml");
		University university = (University) context.getBean("university");
		University university1 = (University) context.getBean("university");
		System.out.println("University details : " + university);
		System.out.println("University details : " + university1);
		System.out.println("University Hashcode : " + university.hashCode());
		System.out.println("University Hashcode : " + university1.hashCode());
	}
}
