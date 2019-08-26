package com.tu.abnormality.converter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

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
import com.tu.abnormality.repository.AbnormalityAttributesRepositoryImpl;

public class AddViewConverter {
	@Autowired
	private AbnormalityAttributesRepositoryImpl abnormalityAttributesRepository;

	public Abnormality convertToAbnormality(AddView abnormalityViewToConvert) throws IOException {
		BreastPosition breastPosition = abnormalityAttributesRepository
				.getBreastPositionByName(abnormalityViewToConvert.getBreastPosition());
		BreastGlandularity breastGlandularity = abnormalityAttributesRepository
				.getBreastGlandularityByName(abnormalityViewToConvert.getBreastGlandularity());
		CancerType cancerType = abnormalityAttributesRepository
				.getCancerTypeByName(abnormalityViewToConvert.getCancerType());
		Shape shape = abnormalityAttributesRepository.getShapeByName(abnormalityViewToConvert.getShape());
		Modality modality = abnormalityAttributesRepository.getModalityByName(abnormalityViewToConvert.getModality());
		GeneticScore geneticScore = abnormalityAttributesRepository
				.getGeneticScoreByName(abnormalityViewToConvert.getGeneticScore());
		MalignancyScore malignancyScore = abnormalityAttributesRepository
				.getMalignancyScoreByName(abnormalityViewToConvert.getMalignancyScore());
		Vendor vendor = abnormalityAttributesRepository.getVendorByName(abnormalityViewToConvert.getVendor());
		byte image = abnormalityViewToConvert.getImage().getBytes();

		Abnormality abnormality = new Abnormality();
		abnormality.setAge(abnormalityViewToConvert.getAge());
		abnormality.setBreast(abnormalityViewToConvert.getBreast());
		abnormality.setBreastPosition(breastPosition);
		abnormality.setBreastPositionDescription(abnormalityViewToConvert.getBreastPositionDescription());
		abnormality.setBreastGlandularity(breastGlandularity);
		abnormality.setBreastGlandularityDescription(abnormalityViewToConvert.getBreastGlandularityDescription());
		abnormality.setBreastThickness(abnormalityViewToConvert.getBreastThickness());
		abnormality.setSize(abnormalityViewToConvert.getSize());
		abnormality.setScreenDetected(abnormalityViewToConvert.getScreenDetected());
		abnormality.setPalpable(abnormalityViewToConvert.getPalpable());
		abnormality.setCancerType(cancerType);
		abnormality.setCancerTypeDescription(abnormalityViewToConvert.getCancerTypeDescription());
		abnormality.setShape(shape);
		abnormality.setShapeDescription(abnormalityViewToConvert.getShapeDescription());
		abnormality.setModality(modality);
		abnormality.setGeneticScore(geneticScore);
		abnormality.setMalignancyScore(malignancyScore);
		abnormality.setVendor(vendor);
		abnormality.setImage(image);

		return abnormality;
	}

}
