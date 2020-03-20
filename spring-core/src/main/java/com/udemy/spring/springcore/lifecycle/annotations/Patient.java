package com.udemy.spring.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient{ 
	private int id;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		// to prove that this hi method is invoked after the setter
		//method are called 
		System.out.println("Inside the setter method");  
		this.id = id;
	}

//  init method and name can be anything
	@PostConstruct
	public void hi() {
		System.out.println("Inside Hi Method");
	}
	
//  destroy method and name can be anything
	@PreDestroy
	public void bye() {
		System.out.println("Inside Bye Method");
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
