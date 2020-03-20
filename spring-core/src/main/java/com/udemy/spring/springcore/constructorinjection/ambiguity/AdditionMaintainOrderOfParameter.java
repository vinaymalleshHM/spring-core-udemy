package com.udemy.spring.springcore.constructorinjection.ambiguity;

import lombok.Data;

@Data 
public class AdditionMaintainOrderOfParameter {

	AdditionMaintainOrderOfParameter(int a, double b){
		System.out.println("Inside the Constructor");
	}
	
	
	
}
