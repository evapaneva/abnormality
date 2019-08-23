package com.tu.abnormality.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tu.abnormality.model.entities.Vendor;
import com.tu.abnormality.repository.VendorRepositoryImpl;
import com.tu.abnormality.service.interfaces.VendorService;

@Service
public class VendorServiceImpl implements VendorService {
	@Autowired
	VendorRepositoryImpl vendorRepository;

	@Transactional
	@Override
	public List<Vendor> getAll() {
		return vendorRepository.getAll();
	}

	@Transactional
	@Override
	public Vendor getVendorByName(String vendor) {
		return vendorRepository.getVendorByName(vendor);
	}

}
