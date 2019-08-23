package com.tu.abnormality.repository.interfaces;

import java.util.List;

import com.tu.abnormality.model.entities.Vendor;

public interface VendorRepository {
	List <Vendor> getAll();
	Vendor getVendorByName(String vendor);

}
