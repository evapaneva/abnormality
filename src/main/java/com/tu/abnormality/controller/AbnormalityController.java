package com.tu.abnormality.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.tu.abnormality.converter.AddViewConverter;
import com.tu.abnormality.model.entities.Abnormality;
import com.tu.abnormality.model.entities.BreastGlandularity;
import com.tu.abnormality.model.entities.BreastPosition;
import com.tu.abnormality.model.entities.CancerType;
import com.tu.abnormality.model.entities.GeneticScore;
import com.tu.abnormality.model.entities.MalignancyScore;
import com.tu.abnormality.model.entities.Modality;
import com.tu.abnormality.model.entities.Shape;
import com.tu.abnormality.model.entities.Vendor;
import com.tu.abnormality.model.views.AddView;
import com.tu.abnormality.services.AbnormalityAttributesServiceImpl;
import com.tu.abnormality.services.AbnormalityServiceImpl;

@Controller
public class AbnormalityController {
	@Autowired
	AbnormalityServiceImpl abnormalityService;
	@Autowired
	AddViewConverter addViewConverter;
	@Autowired
	AbnormalityAttributesServiceImpl abnormalityAttributesService;

	@GetMapping("/add")
	public ModelAndView get(AddView addView) {
		return new ModelAndView("/add").addObject("abnormality", addView);
	}

	@PostMapping("/add")
	public String register(@Valid @ModelAttribute("abnormality") AddView addView, BindingResult result, Model model) {

		Abnormality abnormality = new Abnormality();
		try {
			abnormality = addViewConverter.convertToAbnormality(addView);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		abnormalityService.create(abnormality);
		return "redirect:/add";
	}

	@ModelAttribute("breastPositions")
	public List<BreastPosition> getBreastPosition() {
		return abnormalityAttributesService.getAllBreastPositions();
	}

	@ModelAttribute("breastGlandularities")
	public List<BreastGlandularity> getBreastGlandularity() {
		return abnormalityAttributesService.getAllBreastGlandularities();
	}

	@ModelAttribute("cancerTypes")
	public List<CancerType> getCancerType() {
		return abnormalityAttributesService.getAllCancerTypes();
	}

	@ModelAttribute("shapes")
	public List<Shape> getShape() {
		return abnormalityAttributesService.getAllShapes();
	}

	@ModelAttribute("modalities")
	public List<Modality> getModality() {
		return abnormalityAttributesService.getAllModalities();
	}

	@ModelAttribute("geneticScores")
	public List<GeneticScore> getGeneticScore() {
		return abnormalityAttributesService.getAllGeneticScores();
	}

	@ModelAttribute("malignancyScores")
	public List<MalignancyScore> getMalignancyScore() {
		return abnormalityAttributesService.getAllMalignancyScores();
	}

	@ModelAttribute("vendors")
	public List<Vendor> getVendor() {
		return abnormalityAttributesService.getAllVendors();
	}

}
