package com.udemy.spring.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		// ApplicationContext is a parent interface
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/assignment/cartconfig.xml");
		ShopingCart shopingCart = (ShopingCart) context.getBean("shoppingcart");
		System.out.println("items : " + shopingCart);
	}
}
