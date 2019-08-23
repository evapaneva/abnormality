package com.tu.abnormality.model.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "role")
@Component
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;
	
	public Role() {
		
	}
	
	public Role(final String description) {
		this.description=description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		return String.format("{ID=%d, description=%s}", id, description);
	}
	
	@Override
	public boolean equals(Object o) {

		if (o == null) {
			return false;
		}
		if (!(o instanceof Role)) {
			return false;
		}
		final Role anotherObject = (Role) o;
		if (!(this.id.equals(anotherObject.id) && this.description.equals(anotherObject.description))) {
			return false;
		}
		return true;

	}

	@Override
	public int hashCode() {
		return Objects.hash(description);
	}

}
