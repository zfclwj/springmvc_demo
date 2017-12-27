package com.jpa.service;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.model.Users;
import com.jpa.repositories.UsersRepository;

@Service
public class UserRepositoryServiceImpl implements UserRepositoryService {

	@Autowired
	private UsersRepository repository;
	
	
	public Users findByUserNameAndPassword(String name, String password){
		
		
		return repository.findByUserNameAndPassword(name, password);
		
	}

	/*public static void main(String[] args){
	
		
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		 
	    System.out.println("Languages which starts with J :");
	    filter(languages, (str)->((String) str).startsWith("J"));
	 
	    System.out.println("Languages which ends with a ");
	    filter(languages, (str)->((String) str).endsWith("a"));
	 
	    System.out.println("Print all languages :");
	    filter(languages, (str)->true);
	 
	    System.out.println("Print no language : ");
	    filter(languages, (str)->false);
	 
	    System.out.println("Print language whose length greater than 4:");
	    filter(languages, (str)->((String) str).length() > 4);
	}

	public static void filter(List<String> names, Predicate condition) {
	    for(String name : names){
	       if(condition.test(name)) {
	          System.out.println(name + " ");
	       }
	    }
		
	}*/
}
