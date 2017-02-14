package com.savvydude.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(){
		return "home";
	}
	@RequestMapping("/aboutus")
	public String aboutUs(){
		return "aboutus";
	}
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	@RequestMapping("/contactus")
	public String contactus(){
		return "contactus";
	}
	@RequestMapping("/signup")
	public String signup(){
		return "signup";
	}
	}