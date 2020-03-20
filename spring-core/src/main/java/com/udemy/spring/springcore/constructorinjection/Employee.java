package com.udemy.spring.springcore.constructorinjection;

import lombok.Data;

@Data
public class Employee {
	private int id;
	private Address address;
	
	public Employee(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}
	
	

}
