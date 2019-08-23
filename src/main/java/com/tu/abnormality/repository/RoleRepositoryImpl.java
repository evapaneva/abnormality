package com.tu.abnormality.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tu.abnormality.model.entities.Role;
import com.tu.abnormality.repository.interfaces.RoleRepository;

@Repository
public class RoleRepositoryImpl implements RoleRepository {

	@Autowired
	private EntityManager entityManager;

	@Transactional
	@Override
	public Role getRoleByName(String role) {
		return entityManager.createQuery("SELECT role FROM Role role WHERE description = :description", Role.class)
				.setParameter("description", role).getSingleResult();
	}

	@Transactional
	@Override
	public List<Role> getAllRoles() {
		return entityManager.createQuery("SELECT role FROM Role role", Role.class).getResultList();
	}

}
