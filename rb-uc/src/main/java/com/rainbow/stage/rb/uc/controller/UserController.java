package com.rainbow.stage.rb.uc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rainbow.stage.rb.uc.service.BaseUserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Value("${language.en:你好}")
	private String hello;
	
	@Autowired
	private BaseUserService BaseUserService;
	
	@RequestMapping("/{id}")
	public String getUserInfo(@PathVariable int id){
		return hello + "," + BaseUserService.getUserName(id);
	}
}
