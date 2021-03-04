package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
// @Scope(value="prototype")
public class Employee {

	@Id
	private int id;
	private String name;
	private String company_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company_name=" + company_name + "]";
	}
	
	/*
	 * public void show() { System.out.println("hello ankita"); }
	 */
	
	
}
