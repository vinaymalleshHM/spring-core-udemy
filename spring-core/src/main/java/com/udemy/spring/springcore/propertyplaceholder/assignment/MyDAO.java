package com.udemy.spring.springcore.propertyplaceholder.assignment;

import lombok.Data;

@Data
public class MyDAO {
	private String url;

	public MyDAO(String url) {
		super();
		this.url = url;
	}
	
	

}
