package com.udemy.spring.springcore.lifecycle.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter Method");
		this.id = id;
	}

	@Override
	public String toString() {
		return "TicketReservation [id=" + id + "]";
	}

	@PostConstruct
	public void initialize() {
		System.out.println("Inside initialize Method");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside cleanUp Method");
	}
}
