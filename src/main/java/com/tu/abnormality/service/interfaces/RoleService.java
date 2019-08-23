package com.tu.abnormality.service.interfaces;

import java.util.List;

import com.tu.abnormality.model.entities.Role;

public interface RoleService {
	Role getRoleByName(String role);

	List<Role> getAllRoles();

}
