package com.tu.abnormality.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tu.abnormality.model.entities.BreastGlandularity;
import com.tu.abnormality.model.entities.BreastPosition;
import com.tu.abnormality.model.entities.CancerType;
import com.tu.abnormality.model.entities.GeneticScore;
import com.tu.abnormality.model.entities.MalignancyScore;
import com.tu.abnormality.model.entities.Modality;
import com.tu.abnormality.model.entities.Shape;
import com.tu.abnormality.model.entities.Vendor;
import com.tu.abnormality.repository.AbnormalityAttributesRepositoryImpl;
import com.tu.abnormality.service.interfaces.AbnormalityAttributesService;

@Service
public class AbnormalityAttributesServiceImpl implements AbnormalityAttributesService {
	@Autowired
	AbnormalityAttributesRepositoryImpl abnormalityAttributesRepository;

	@Transactional
	@Override
	public BreastPosition getBreastPositionByName(String breastPosition) {
		return abnormalityAttributesRepository.getBreastPositionByName(breastPosition);
	}

	@Transactional
	@Override
	public List<BreastPosition> getAllBreastPositions() {
		return abnormalityAttributesRepository.getAllBreastPositions();
	}

	@Transactional
	@Override
	public BreastGlandularity getBreastGlandularityByName(String breastGlandularity) {
		return abnormalityAttributesRepository.getBreastGlandularityByName(breastGlandularity);
	}

	@Transactional
	@Override
	public List<BreastGlandularity> getAllBreastGlandularities() {
		return abnormalityAttributesRepository.getAllBreastGlandularities();
	}

	@Transactional
	@Override
	public CancerType getCancerTypeByName(String cancerType) {
		return abnormalityAttributesRepository.getCancerTypeByName(cancerType);
	}

	@Transactional
	@Override
	public List<CancerType> getAllCancerTypes() {
		return abnormalityAttributesRepository.getAllCancerTypes();
	}

	@Transactional
	@Override
	public Shape getShapeByName(String shape) {
		return abnormalityAttributesRepository.getShapeByName(shape);
	}

	@Transactional
	@Override
	public List<Shape> getAllShapes() {
		return abnormalityAttributesRepository.getAllShapes();
	}

	@Transactional
	@Override
	public Modality getModalityByName(String modality) {
		return abnormalityAttributesRepository.getModalityByName(modality);
	}

	@Transactional
	@Override
	public List<Modality> getAllModalities() {
		return abnormalityAttributesRepository.getAllModalities();
	}

	@Transactional
	@Override
	public GeneticScore getGeneticScoreByName(String geneticScore) {
		return abnormalityAttributesRepository.getGeneticScoreByName(geneticScore);
	}

	@Transactional
	@Override
	public List<GeneticScore> getAllGeneticScores() {
		return abnormalityAttributesRepository.getAllGeneticScores();
	}

	@Transactional
	@Override
	public MalignancyScore getMalignancyScoreByName(String malignancyScore) {
		return abnormalityAttributesRepository.getMalignancyScoreByName(malignancyScore);
	}

	@Transactional
	@Override
	public List<MalignancyScore> getAllMalignancyScores() {
		return abnormalityAttributesRepository.getAllMalignancyScores();
	}

	@Transactional
	@Override
	public Vendor getVendorByName(String vendor) {
		return abnormalityAttributesRepository.getVendorByName(vendor);
	}

	@Transactional
	@Override
	public List<Vendor> getAllVendors() {
		return abnormalityAttributesRepository.getAllVendors();
	}

}
