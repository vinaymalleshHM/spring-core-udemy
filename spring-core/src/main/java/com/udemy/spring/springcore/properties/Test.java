package com.udemy.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		// ApplicationContext is a parent interface
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/properties/propsconfig.xml");
		CountriesAndLanguages countryAndLanguages = (CountriesAndLanguages) context.getBean("countriesAndLangs");
		System.out.println("Properties : " + countryAndLanguages);
		System.out.println("Properties : " + countryAndLanguages.getCountryAndLangs());
		System.out.println("To know Which Class Implemented a Properties : " + countryAndLanguages.getCountryAndLangs().getClass());
	}
}
