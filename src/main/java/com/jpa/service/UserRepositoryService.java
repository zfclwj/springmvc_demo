package com.jpa.service;

import com.jpa.model.Users;

public interface UserRepositoryService {

	public Users findByUserNameAndPassword(String name, String password);
}
