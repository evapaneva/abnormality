package com.tu.abnormality.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tu.abnormality.model.entities.User;
import com.tu.abnormality.repository.interfaces.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private EntityManager entityManager;

	@Transactional
	@Override
	public User getUserWithGivenCredentials(String username, String password) {
		return entityManager
				.createQuery("SELECT user FROM User user WHERE username = :username AND password=:password", User.class)
				.setParameter("username", username).setParameter("password", password).getSingleResult();
	}

	@Transactional
	@Override
	public User getUserByUsername(String username) {
		return entityManager.createQuery("SELECT user FROM User user WHERE username = :username", User.class)
				.setParameter("username", username).getSingleResult();
	}

	@Transactional
	@Override
	public boolean existsWithGivenUsername(String username) {
		return entityManager.createQuery("SELECT u FROM User u WHERE u.username=:username")
				.setParameter("username", username).getResultList().size() == 1;
	}

	@Transactional
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public User create(User userToCreate) {
		entityManager.persist(userToCreate);
		return userToCreate;
	}

}
