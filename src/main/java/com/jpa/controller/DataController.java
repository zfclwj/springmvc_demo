package com.jpa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jpa.model.Users;
import com.jpa.repositories.UsersRepository;
import com.jpa.service.UserRepositoryService;


@Controller
@RequestMapping(value = "/views")
public class DataController {

	@Autowired
	private UserRepositoryService userRepositoryService;
	
	@RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST}, produces = "text/html;charset=UTF-8")
	public ModelAndView findbyNameAndAddress(String name, String password){
		
		Users user = userRepositoryService.findByUserNameAndPassword(name, password);
		if (name == user.getName()&& password == user.getPassword()) {
			System.out.println(user+"success");
			return new ModelAndView("ok");
		}else{
			return new ModelAndView("not");
		}
		
	}
	/*public static void main(String[] args){
		SpringApplication.run(DataController.class,args);
	}*/
	/*@RequestMapping("/findAll")
	public String findAll(HttpServletRequest request, HttpServletResponse response) {
		List<Users> list = userRepositoryService.findAll();
		request.setAttribute("usersList", list);
		System.out.println(list+"_____________");
		return "users";
	}*/
}
