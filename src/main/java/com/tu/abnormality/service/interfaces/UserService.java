package com.tu.abnormality.service.interfaces;

import com.tu.abnormality.model.entities.User;

public interface UserService {
	User create(User userToCreate);

	User getUserWithGivenCredentials(String username, String password);

	User getUserByUsername(String username);

	boolean existsWithGivenUsername(String username);

}
