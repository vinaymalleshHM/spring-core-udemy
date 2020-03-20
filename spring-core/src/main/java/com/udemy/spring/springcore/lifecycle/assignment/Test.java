package com.udemy.spring.springcore.lifecycle.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		// AbstractApplicationContext is a parent interface and it is used to invoke destroy method
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springcore/lifecycle/assignment/config.xml");
		TicketReservation ticketReservation = (TicketReservation) context.getBean("ticketreservation");
		System.out.println("TicketReservation Id : " + ticketReservation);
		context.registerShutdownHook();
	}
}
