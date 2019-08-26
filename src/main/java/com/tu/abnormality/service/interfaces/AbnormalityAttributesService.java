package com.tu.abnormality.service.interfaces;

import java.util.List;

import com.tu.abnormality.model.entities.BreastGlandularity;
import com.tu.abnormality.model.entities.BreastPosition;
import com.tu.abnormality.model.entities.CancerType;
import com.tu.abnormality.model.entities.GeneticScore;
import com.tu.abnormality.model.entities.MalignancyScore;
import com.tu.abnormality.model.entities.Modality;
import com.tu.abnormality.model.entities.Shape;
import com.tu.abnormality.model.entities.Vendor;

public interface AbnormalityAttributesService {
	BreastPosition getBreastPositionByName(String breastPosition);
	List <BreastPosition> getAllBreastPositions();
	
	BreastGlandularity getBreastGlandularityByName(String breastGlandularity);
	List <BreastGlandularity> getAllBreastGlandularities();
	
	CancerType getCancerTypeByName(String cancerType);
	List <CancerType> getAllCancerTypes();
	
	Shape getShapeByName(String shape);
	List <Shape> getAllShapes();
	
	Modality getModalityByName(String modality);
	List <Modality> getAllModalities();
	
	GeneticScore getGeneticScoreByName(String geneticScore);
	List <GeneticScore> getAllGeneticScores();
	
	MalignancyScore getMalignancyScoreByName(String malignancyScore);
	List <MalignancyScore> getAllMalignancyScores();
	
	Vendor getVendorByName(String vendor);
	List <Vendor> getAllVendors();

}
