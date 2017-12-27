package com.jpa.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpa.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

	@Query (value =" select * from user where name=?l and password=?2 ",
			nativeQuery=true )
	public Users findByUserNameAndPassword(String name, String password);
	
	
}
