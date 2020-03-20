package com.udemy.spring.springcore.lifecycle.springinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean { 
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
	public void hi() {
		System.out.println("Inside Hi Method");
	}
	
//  destroy method and name can be anything	
	public void bye() {
		System.out.println("Inside Bye Method");
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}


	// init method
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet()");
	}

    // destroy method
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside  destroy()");
		
	}
	
	

}
