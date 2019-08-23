package com.tu.abnormality.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tu.abnormality.converter.AddNewAbnormalityConverter;
import com.tu.abnormality.model.entities.Abnormality;
import com.tu.abnormality.model.entities.Vendor;
import com.tu.abnormality.model.views.AddView;
import com.tu.abnormality.services.AbnormalityServiceImpl;
import com.tu.abnormality.services.VendorServiceImpl;

public class AbnormalityController {
	@Autowired
	VendorServiceImpl vendorService;
	@Autowired
	AbnormalityServiceImpl abnormalityService;
	@Autowired
	AddNewAbnormalityConverter addNewAbnormalityConverter;

	@GetMapping("/a")
	public String homePageSetUp() {
		return "addnewabnormality";
	}

	@PostMapping(value = "/addnewabnormality")
	public String addNewAbnormality(@ModelAttribute("addnewabnormality") AddView newAbnormality) {
		Abnormality abnormality = addNewAbnormalityConverter.convertToAbnormality(newAbnormality);
		System.out.println(abnormality.getAge());
		return "redirect:/";

	}

	@ModelAttribute("vendors")
	public List<Vendor> getVendor() {
		return vendorService.getAll();
	}
}
