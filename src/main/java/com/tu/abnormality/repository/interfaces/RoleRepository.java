package com.tu.abnormality.repository.interfaces;

import java.util.List;

import com.tu.abnormality.model.entities.Role;

public interface RoleRepository {
	Role getRoleByName(String role);

	List<Role> getAllRoles();
}
