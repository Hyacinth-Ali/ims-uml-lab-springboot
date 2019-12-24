package com.ali.hyacinth.ims.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public abstract class EmployeeRole {
	
	@Column(nullable = false)
	private String userId;

	public void setUserId(String value) {
		this.userId = value;
	}

	public String getUserId() {
		return this.userId;
	}

	@Column(nullable = false, length = 120)
	private String email;

	public void setEmail(String value) {
		this.email = value;
	}

	public String getEmail() {
		return this.email;
	}

	@Column(nullable = false, length = 50)
	private String userName;

	public void setUserName(String value) {
		this.userName = value;
	}

	public String getUserName() {
		return this.userName;
	}

	@Column(nullable = false)
	private String encryptedPassword;

	public void setEncryptedPassword(String value) {
		this.encryptedPassword = value;
	}

	public String getEncryptedPassword() {
		return this.encryptedPassword;
	}
}
