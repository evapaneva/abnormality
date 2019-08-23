package com.tu.abnormality.model.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="genetic_score")
@Component
public class GeneticScore {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;
	
	public GeneticScore() {
		
	}
	
	public GeneticScore ( final String description) {
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
	
	@Override
	public boolean equals(Object o) {

		if (o == null) {
			return false;
		}
		if (!(o instanceof GeneticScore)) {
			return false;
		}
		final GeneticScore anotherObject = (GeneticScore) o;
		if (!(this.description.equals(anotherObject.description))) {
			return false;
		}
		return true;

	}

	@Override
	public int hashCode() {
		return Objects.hash(description);
	}

}
