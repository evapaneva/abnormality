package com.tu.abnormality.model.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "user")
@Component
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@Column(unique = true)
	private String username;

	@NotNull
	private String password;

	@ManyToOne 
	@NotNull
	@JoinColumn(name = "role_id")
	private Role role;

	public User() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String toString() {
		return String.format("{ID=%d, Username=%s, Password=%s, Role=%s}",
				id, username, password, role);
	}
	
	@Override
	public boolean equals(Object o) {

		if (o == null) {
			return false;
		}
		if (!(o instanceof User)) {
			return false;
		}
		final User anotherObject = (User) o;
		if (!(this.id.equals(anotherObject.id)
				&& this.username.equals(anotherObject.username) && this.password.equals(anotherObject.password)
				&& this.role.equals(anotherObject.role))) {
			return false;
		}
		return true;

	}

	@Override
	public int hashCode() {
		return Objects.hash(username, password, role);
	}

}
