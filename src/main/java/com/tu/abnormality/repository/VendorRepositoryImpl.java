package com.tu.abnormality.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tu.abnormality.model.entities.Vendor;
import com.tu.abnormality.repository.interfaces.VendorRepository;

@Repository
public class VendorRepositoryImpl implements VendorRepository{
	@Autowired
	private EntityManager entityManager;

	@Transactional
	@Override
	public List<Vendor> getAll() {
		return entityManager
				.createQuery("SELECT vendor FROM Vendor vendor", Vendor.class)
				.getResultList();
	}

	@Transactional
	@Override
	public Vendor getVendorByName(String vendor) {
		return entityManager
				.createQuery("SELECT vendor FROM Vendor vendor WHERE vendor = :vendor", Vendor.class)
				.setParameter("vendor", vendor)
				.getSingleResult();
	}


}
