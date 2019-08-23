package com.tu.abnormality.model.views;

import javax.validation.constraints.NotEmpty;

public class RegisterView {
	@NotEmpty(message = "The username cannot be empty")
	private String username;

	@NotEmpty(message = "The password cannot be empty")
	private String password;
	
	@NotEmpty(message = "The role cannot be empty")
	private String role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String toString() {
		return String.format("{Username=%s, Password=%s, Role=%s}", username, password, role);
	}

}
