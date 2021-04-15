package com.udemy.barath.spring.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean{

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
	@Override
	public void destroy() { //must enable pre shutdown hook in Spring
		System.out.println("inside destroy method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside after properties set");
	}
	
}
