package com.udemy.barath.spring.lc.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void init() {
		System.out.println("inside init method");
	}
	
	public void destroy() { //must enable pre shutdown hook in Spring
		System.out.println("inside destroy method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
}
