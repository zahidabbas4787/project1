package com.Spring.LifeCyclemethod.UsingAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	private int employeeId;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Employee() {
		super();
		
		
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("i am init method");
		
	}
	@PreDestroy
	public void end() {
		System.out.println("i am in destroye method");
	}
	

}
