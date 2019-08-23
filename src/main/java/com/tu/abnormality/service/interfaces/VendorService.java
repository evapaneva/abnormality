package com.tu.abnormality.service.interfaces;

import java.util.List;

import com.tu.abnormality.model.entities.Vendor;

public interface VendorService {
	List<Vendor> getAll();

	Vendor getVendorByName(String vendor);

}
