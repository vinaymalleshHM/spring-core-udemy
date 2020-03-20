package com.udemy.spring.springcore.list;

import java.util.List;

import lombok.Data;

@Data
public class Hospital {
	private String name;
	private List<String> departments;

}
