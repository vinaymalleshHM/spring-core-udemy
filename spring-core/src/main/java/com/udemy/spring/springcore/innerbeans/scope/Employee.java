package com.udemy.spring.springcore.innerbeans.scope;

import lombok.Data;
//if u specify scope as prototype then don't use @data bcz compiler will not
//know weather the class has getter and setter so it will generate same hashcode if u use Scope="prototype"
//@Data
public class Employee {
	private int id;
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

}
