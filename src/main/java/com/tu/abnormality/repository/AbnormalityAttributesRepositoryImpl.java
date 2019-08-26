package com.tu.abnormality.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tu.abnormality.model.entities.BreastGlandularity;
import com.tu.abnormality.model.entities.BreastPosition;
import com.tu.abnormality.model.entities.CancerType;
import com.tu.abnormality.model.entities.GeneticScore;
import com.tu.abnormality.model.entities.MalignancyScore;
import com.tu.abnormality.model.entities.Modality;
import com.tu.abnormality.model.entities.Shape;
import com.tu.abnormality.model.entities.Vendor;
import com.tu.abnormality.repository.interfaces.AbnormalityAttributesRepository;

@Repository
public class AbnormalityAttributesRepositoryImpl implements AbnormalityAttributesRepository {
	@Autowired
	private EntityManager entityManager;

	@Transactional
	@Override
	public BreastPosition getBreastPositionByName(String breastPosition) {
		return entityManager.createQuery("SELECT breastPosition FROM BreastPosition breastPosition WHERE type= :type", BreastPosition.class)
				.setParameter("type", breastPosition).getSingleResult();
	}

	@Transactional
	@Override
	public List<BreastPosition> getAllBreastPositions() {
		return entityManager.createQuery("SELECT breastPosition FROM BreastPosition breastPosition", BreastPosition.class).getResultList();
	}

	@Transactional
	@Override
	public BreastGlandularity getBreastGlandularityByName(String breastGlandularity) {
		return entityManager.createQuery("SELECT breastGlandularity FROM BreastGlandularity breastGlandularity WHERE type= :type", BreastGlandularity.class)
				.setParameter("type", breastGlandularity).getSingleResult();
	}

	@Transactional
	@Override
	public List<BreastGlandularity> getAllBreastGlandularities() {
		return entityManager.createQuery("SELECT breastGlandularity FROM BreastGlandularity breastGlandularity", BreastGlandularity.class).getResultList();
	}

	@Transactional
	@Override
	public CancerType getCancerTypeByName(String cancerType) {
		return entityManager.createQuery("SELECT cancerType FROM CancerType cancerType WHERE type= :type", CancerType.class)
				.setParameter("type", cancerType).getSingleResult();
	}

	@Override
	public List<CancerType> getAllCancerTypes() {
		return entityManager.createQuery("SELECT cancerType FROM CancerType cancerType", CancerType.class).getResultList();
	}

	@Override
	public Shape getShapeByName(String shape) {
		return entityManager.createQuery("SELECT shape FROM Shape shape WHERE type= :type", Shape.class)
				.setParameter("type", shape).getSingleResult();
	}

	@Override
	public List<Shape> getAllShapes() {
		return entityManager.createQuery("SELECT shape FROM Shape shape", Shape.class).getResultList();
	}

	@Override
	public Modality getModalityByName(String modality) {
		return entityManager.createQuery("SELECT modality FROM Modality modality WHERE type= :type", Modality.class)
				.setParameter("type", modality).getSingleResult();
	}

	@Override
	public List<Modality> getAllModalities() {
		return entityManager.createQuery("SELECT modality FROM Modality modality", Modality.class).getResultList();
	}

	@Override
	public GeneticScore getGeneticScoreByName(String geneticScore) {
		return entityManager.createQuery("SELECT geneticScore FROM GeneticScore geneticScore WHERE description= :description", GeneticScore.class)
				.setParameter("description", geneticScore).getSingleResult();
	}

	@Override
	public List<GeneticScore> getAllGeneticScores() {
		return entityManager.createQuery("SELECT geneticScore FROM GeneticScore geneticScore", GeneticScore.class).getResultList();
	}

	@Override
	public MalignancyScore getMalignancyScoreByName(String malignancyScore) {
		return entityManager.createQuery("SELECT malignancyScore FROM MalignancyScore malignancyScore WHERE description= :description", MalignancyScore.class)
				.setParameter("description", malignancyScore).getSingleResult();
	}

	@Override
	public List<MalignancyScore> getAllMalignancyScores() {
		return entityManager.createQuery("SELECT malignancyScore FROM MalignancyScore malignancyScore", MalignancyScore.class).getResultList();
	}

	@Override
	public Vendor getVendorByName(String vendor) {
		return entityManager.createQuery("SELECT vendor FROM Vendor vendor WHERE type= :type", Vendor.class)
				.setParameter("type", vendor).getSingleResult();
	}

	@Override
	public List<Vendor> getAllVendors() {
		return entityManager.createQuery("SELECT vendor FROM Vendor vendor", Vendor.class).getResultList();
	}

}
