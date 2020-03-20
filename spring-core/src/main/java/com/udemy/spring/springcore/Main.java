package com.udemy.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.udemy.spring.springcore.beans.Employee;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Employee employee = applicationContext.getBean(Employee.class);
		// if u gave bean name as a parameter to the getBean("emp") i have to do upcasting
//		Employee employee = (Employee) applicationContext.getBean("emp");
		System.out.println("Employee Id : "+employee.getId());
		System.out.println("Employee Name : "+employee.getName());
	}

}
