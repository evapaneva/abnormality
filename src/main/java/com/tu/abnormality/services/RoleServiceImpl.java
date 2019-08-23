package com.tu.abnormality.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tu.abnormality.model.entities.Role;
import com.tu.abnormality.repository.RoleRepositoryImpl;
import com.tu.abnormality.service.interfaces.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleRepositoryImpl roleRepository;

	@Transactional
	@Override
	public Role getRoleByName(String role) {
		return roleRepository.getRoleByName(role);
	}

	@Transactional
	@Override
	public List<Role> getAllRoles() {
		return roleRepository.getAllRoles();
	}

}
