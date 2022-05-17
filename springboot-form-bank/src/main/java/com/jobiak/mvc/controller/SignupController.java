package com.jobiak.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mvc.model.BankDetails;
import com.jobiak.mvc.repository.UserRepository;


	@Controller
	public class SignupController
	{
		@Autowired
		UserRepository repo;
	

		@RequestMapping(path="/test",method=RequestMethod.GET)
	    public String redirect()
		{
			return "signup";
		}
		@RequestMapping(path="/signup",method=RequestMethod.POST)
	    public String doSignUp(@ModelAttribute("user")BankDetails user) {
		{
			repo.save(user);
			return "success";


	}
	}
		
	}


