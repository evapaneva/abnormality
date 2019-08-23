package com.tu.abnormality.model.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="vendor")
@Component
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String vendor;
	
	public Vendor() {
		
	}
	
	public Vendor(final String vendor) {
		this.vendor=vendor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	
	@Override
	public boolean equals(Object o) {

		if (o == null) {
			return false;
		}
		if (!(o instanceof Vendor)) {
			return false;
		}
		final Vendor anotherObject = (Vendor) o;
		if (!(this.vendor.equals(anotherObject.vendor))) {
			return false;
		}
		return true;

	}

	@Override
	public int hashCode() {
		return Objects.hash(vendor);
	}
}
