package com.tu.abnormality.model.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="breast_position")
@Component
public class BreastPosition {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String type;
	
	public BreastPosition() {
		
	}
	
	public BreastPosition(final String type) {
		this.type=type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public boolean equals(Object o) {

		if (o == null) {
			return false;
		}
		if (!(o instanceof BreastPosition)) {
			return false;
		}
		final BreastPosition anotherObject = (BreastPosition) o;
		if (!(this.type.equals(anotherObject.type))) {
			return false;
		}
		return true;

	}

	@Override
	public int hashCode() {
		return Objects.hash(type);
	}
}
