package com.tu.abnormality.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tu.abnormality.model.entities.User;
import com.tu.abnormality.repository.UserRepositoryImpl;
import com.tu.abnormality.service.interfaces.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepositoryImpl userRepository;

	@Transactional
	@Override
	public User create(User userToCreate) {
		return userRepository.create(userToCreate);
	}

	@Transactional
	@Override
	public User getUserWithGivenCredentials(String username, String password) {
		return userRepository.getUserWithGivenCredentials(username, password);
	}

	@Transactional
	@Override
	public User getUserByUsername(String username) {
		return userRepository.getUserByUsername(username);
	}

	@Transactional
	@Override
	public boolean existsWithGivenUsername(String username) {
		return userRepository.existsWithGivenUsername(username);
	}

}
