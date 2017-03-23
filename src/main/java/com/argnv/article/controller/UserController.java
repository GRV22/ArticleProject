package com.argnv.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.argnv.article.Services.UserService;

@RestController
public class UserController {

	UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value = "/user/by/id",method = RequestMethod.GET)//,produces = "application/json")
    public String getAnUser(@RequestParam long userId) throws Exception {
        
		try {
			System.out.println("User controller, user id "+userId);
			return userService.getUserById(userId);
		} catch (Exception e) {
			e.printStackTrace(); 
			throw e;
		}
    }
}
