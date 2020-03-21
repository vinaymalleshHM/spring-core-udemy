package com.udemy.spring.springcore.innerbeans.scope;

import lombok.Data;

//if u specify scope as prototype then don't use @data bcz compiler will not
//know weather the class has getter and setter so it will generate same hashcode if u use Scope="prototype"
//@Data 

public class Address {

	private int hNo;
	private String street;
	private String city;
	public int gethNo() {
		return hNo;
	}
	public void sethNo(int hNo) {
		this.hNo = hNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", street=" + street + ", city=" + city + "]";
	}
	
}
