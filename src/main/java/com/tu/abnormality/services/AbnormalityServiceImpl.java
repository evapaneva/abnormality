package com.tu.abnormality.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tu.abnormality.model.entities.Abnormality;
import com.tu.abnormality.repository.AbnormalityRepositoryImpl;
import com.tu.abnormality.service.interfaces.AbnormalityService;

@Service
public class AbnormalityServiceImpl implements AbnormalityService {

	@Autowired
	private AbnormalityRepositoryImpl abnormalityRepository;

	@Transactional
	@Override
	public Abnormality create(Abnormality abnormality) {
		return abnormalityRepository.create(abnormality);
	}

}
