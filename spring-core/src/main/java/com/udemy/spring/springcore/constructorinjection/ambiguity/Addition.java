package com.udemy.spring.springcore.constructorinjection.ambiguity;

import lombok.Data;

@Data 
public class Addition {

	// if we not specify anything in constructor arg it will invoke 1st constructor 
	// if int constructor is present 1st it will these one
	Addition(double a, double b){
		System.out.println("Inside constructor double");
	}
	
	Addition(int a, int b){
		System.out.println("Inside constructor int");
	}
	
	Addition(String a, String b){
		System.out.println("Inside constructor String");
	}
	
}
