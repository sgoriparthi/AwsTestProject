package com.example;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.User;
import com.example.service.UserService;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@Autowired  
	private UserService userService;
	 
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		
		 User user = this.userService.findById(1);
		 
		model.put("message", this.message + " " + user.getName());
		System.out.println("User Details: " + user.getName() + ", " + user.getEmailId());
		return "welcome";
	}

	public int sum(int a, int b) {
		return a+b;
	}
}