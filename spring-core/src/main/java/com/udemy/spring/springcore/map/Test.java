package com.udemy.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		// ApplicationContext is a parent interface
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/map/mapconfig.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println("Customer Id : " + customer.getId());
		System.out.println("Customer Products : " + customer.getProducts());
		System.out.println(" Customer Details : " + customer);
		System.out.println("To know Which Class Implemented a Map : " + customer.getProducts().getClass());
	}
}
