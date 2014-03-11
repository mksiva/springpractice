package com.mks.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EntryController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(ModelMap model,@RequestParam("uname") String username,@RequestParam("pwd") String pwd) {
		if(username != null && pwd != null
				&& username.equals("siva@tt.com")){
			model.addAttribute("message", "Login Success Mr." + username);
		}else{
			model.addAttribute("message", "Invalid username or password!");
		}
		return "hello";
	}	
	
	@RequestMapping(value = "/registerUser" , method = RequestMethod.GET)
	public String register(ModelMap model){
		return "register";
	}
}
