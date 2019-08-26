package com.tu.abnormality.service.interfaces;

import java.util.List;

import com.tu.abnormality.model.entities.Role;

public interface RoleService {
	Role getRoleByName(String role);

	String getRoleName(Role role);

	List<Role> getAllRoles();

}
