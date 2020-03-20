package com.udemy.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {

		// ApplicationContext is a parent interface 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/constructorinjection/ambiguity/config.xml");
		Addition addition = (Addition) context.getBean("addition");
		System.out.println("University details : " + addition);
		AdditionMaintainOrderOfParameter additionMaintainOrderOfParameter = (AdditionMaintainOrderOfParameter) context.getBean("addMO");
		System.out.println("AdditionMaintainOrderOfParameter : " + additionMaintainOrderOfParameter);
	}
}
