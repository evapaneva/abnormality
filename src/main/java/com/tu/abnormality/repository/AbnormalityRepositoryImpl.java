package com.tu.abnormality.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.TransactionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.tu.abnormality.model.entities.Abnormality;
import com.tu.abnormality.repository.interfaces.AbnormalityRepository;

@Repository
public class AbnormalityRepositoryImpl implements AbnormalityRepository {

	@Autowired
	private EntityManager entityManager;

	@Transactional
	@Override
	public Abnormality create(Abnormality abnormality) {
		try {
			entityManager.persist(abnormality);
		} catch (TransactionException e) {
			System.out.println("Error");
		}
		return abnormality;
	}

}
