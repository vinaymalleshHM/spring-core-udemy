package com.udemy.spring.springcore.map;

import java.util.Map;

import lombok.Data;

@Data
public class Customer {
	private int id;
	private Map<Integer, String> products;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", products=" + products + "]";
	}

}
