package com.ali.hyacinth.ims.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "employees")
public class Employee extends EmployeeRole implements Serializable {
	/**
	 * 
	 */
	@Id
	@GeneratedValue
	private long id;

	public void setId(long value) {
		this.id = value;
	}

	public long getId() {
		return this.id;
	}

	private static final long serialVersionUID = 1677693562604171785L;

	private boolean manager = false;

	/**
	 * @return the manager
	 */
	public boolean isManager() {
		return manager;
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(boolean manager) {
		this.manager = manager;
	}

}
