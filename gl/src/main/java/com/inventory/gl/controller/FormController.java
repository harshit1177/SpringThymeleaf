package com.inventory.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.inventory.gl.controller.model.UserForm;

@Controller
public class FormController {

	//handler mapping for user registration
	@GetMapping("/register")
		public String userRegistrationPage(Model model) {
		
		//empty UserForm model to store form data
		UserForm userForm = new UserForm();
		model.addAttribute("userFormAttributeValue",userForm);
		
		return "register-form";
		
	}
	
	@PostMapping("/register/save")
	  public String saveUser(Model model, @ModelAttribute("userFormAttributeValue3") UserForm userFormDetails) {
		
		model.addAttribute("userFormAttributeValue3",userFormDetails);
		return "register-success";
		
		
		
	}
}
