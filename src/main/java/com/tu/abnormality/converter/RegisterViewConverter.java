package com.tu.abnormality.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.tu.abnormality.model.entities.Role;
import com.tu.abnormality.model.entities.User;
import com.tu.abnormality.model.views.RegisterView;
import com.tu.abnormality.repository.RoleRepositoryImpl;

public class RegisterViewConverter {
	@Autowired
	private RoleRepositoryImpl roleRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public User convertToUser(RegisterView userViewToConvert) {
		Role role = roleRepository.getRoleByName(userViewToConvert.getRole());
		User user = new User();
		user.setPassword(bCryptPasswordEncoder.encode(userViewToConvert.getPassword()));
		user.setUsername(userViewToConvert.getUsername());
		user.setRole(role);
		return user;
	}

}
