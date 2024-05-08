package com.inventory.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {

	//handler method to handle the /helloWorld mapping request
	//http://localhost:8080/hello-world
	
	@GetMapping("/hello-world")
	public String helloWorld(Model model) {
		
		//message = attribute name, 
		//Hello World!!! Harshit this side = attribute value 
		
		model.addAttribute("message3","Hello World 3!!! Harshit this side");
		model.addAttribute("message2","Hello World 2");
		return "HelloWorld";  // returning the view/html file name 
		
	}
	
	@GetMapping("/hello-world2")
	public String helloWorld2(ModelMap model) {
		
		//message = attribute name, 
		//Hello World!!! Harshit this side = attribute value 
		
		model.addAttribute("message3","Hello World 3!!! Harshit this side");
		model.addAttribute("message2","Hello World 2");
		return "HelloWorld";  // returning the view/html file name 
		
	}
	
	
	//handler method to handle the message expression
	@GetMapping("messages")
	public String giveMessages() {
		return "messageUI";
		
	}
	
	@GetMapping("/links")
	public String linkExpression() {
		return "linkUI";
	}
	
	@GetMapping("/fragment")
	public String getFragmentPage() {
		return "fragmentUI";
	}
	
	
	
}
