package com.tu.abnormality.repository.interfaces;

import java.util.List;

import com.tu.abnormality.model.entities.User;

public interface UserRepository {
	User create(User userToCreate);

	User getUserWithGivenCredentials(String username, String password);

	User getUserByUsername(String username);

	boolean existsWithGivenUsername(String username);

	List<User> getAllUsers();

}
