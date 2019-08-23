package com.tu.abnormality.converter;

import org.springframework.beans.factory.annotation.Autowired;

import com.tu.abnormality.model.entities.Abnormality;
import com.tu.abnormality.model.views.AddView;
import com.tu.abnormality.repository.VendorRepositoryImpl;

public class AddNewAbnormalityConverter {
	@Autowired
	VendorRepositoryImpl vendorRepository;

	public Abnormality convertToAbnormality(AddView addNewAbnormality) {
		Abnormality abnormality = new Abnormality();
		abnormality.setAge(addNewAbnormality.getAge());
		abnormality.setBreast(addNewAbnormality.getBreast());
		abnormality.setBreastThickness(addNewAbnormality.getBreastThickness());
		abnormality.setSize(addNewAbnormality.getSize());
		abnormality.setVendor(vendorRepository.getVendorByName(addNewAbnormality.getVendor()));
		return abnormality;
	}

}
