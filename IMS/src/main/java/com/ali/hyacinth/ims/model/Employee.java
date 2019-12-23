package com.ali.hyacinth.ims.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "employees")
public class Employee {
	private String userName;

	public void setUserName(String value) {
		this.userName = value;
	}

	@Id
	@GeneratedValue
	public String getUserName() {
		return this.userName;
	}
}
