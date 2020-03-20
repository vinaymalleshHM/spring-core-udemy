package com.udemy.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/propertyplaceholder/config.xml");
		MyDAO myDAO = (MyDAO) context.getBean("myDAO");
		System.out.println("MyDAO : " + myDAO);
		
	}

}
