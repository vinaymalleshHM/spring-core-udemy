package com.udemy.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		// ApplicationContext is a parent interface
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) context.getBean("cardealer");
		System.out.println("carDealer Name : " + carDealer.getName());
		System.out.println("carDealer Models : " + carDealer.getModels());
		System.out.println("To know Which Class Implemented a Set : " + carDealer.getModels().getClass());
	}
}
