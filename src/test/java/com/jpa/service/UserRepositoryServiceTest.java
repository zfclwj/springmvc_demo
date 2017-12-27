package com.jpa.service;



import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jpa.model.Users;
import com.jpa.service.UserRepositoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@SpringBootTest
public class UserRepositoryServiceTest{
	
	@Resource
	protected UserRepositoryService userRepositoryService;
	/*@Test
	public void testfindAll(){
		//Users user = new Users();
		for (Users user:userRepository.findAll()) {
            System.out.println(user);
        }
        System.out.println("search all success");
	}*/
	
	/*@Test
	public void saveUsers() throws Exception {
        Users user = new Users();
        user.setName("Jay");
        user.setPassword("123456");
        user.setEmail("asd");
        user.setStatus(1);
       userRepository.save(user);
        System.out.println(newuser);
//        userRepository.delete(user);
//        userRepository.findOne(1);
    }*/
	@Test
	public void findByUserNameAndPasswordTest(){
		String name = "Jerry";
		String password="liyu1314";
		Users user = userRepositoryService.findByUserNameAndPassword(name, password);
		System.out.println(user);
	}
}
