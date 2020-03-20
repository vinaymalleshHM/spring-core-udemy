package com.udemy.spring.springcore.propertyplaceholder;

import lombok.Data;

@Data
public class MyDAO {
	private String dbServer;

	public MyDAO(String dbServer) {
		super();
		this.dbServer = dbServer;
	}
	
	

}
