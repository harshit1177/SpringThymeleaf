package com.inventory.gl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inventory.gl.controller.model.Student;

@Controller
@RequestMapping("/project")
public class StudentController {

	@GetMapping("/student")
	//@RequestMapping(value = "/studetn", method = RequestMethod.GET)
	public String giveStudentDetails(Model model) {
		Student student = new Student("Harshit", "Harshit@gmail.com", "Male");
		model.addAttribute("studentAttribute", student);
		return "studentUI";
	}
	
	@GetMapping("/teacher")
	public String giveTeacherDetails(Model model) {
		Student student = new Student("ABC", "ABC@gmail.com", "Male");
		model.addAttribute("studentAttribute", student);
		return "studentUI";
	}
	
	@GetMapping("/listStudents")
	public String giveStudentsDetails(Model model) {
		Student student1 = new Student("DEF", "DEF@gmail.com", "Male");
		Student student2 = new Student("Harshit", "Harshit@gmail.com", "Male");
		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		model.addAttribute("studentAttribute", students);
		return "displayAllStudents";
	}
	@GetMapping("/ifUnless")
	public String giveIfUnlessResults(Model model) {
		Student student1 = new Student("DEF", "DEF@gmail.com", "Male");
		Student student2 = new Student("Harshit", "Harshit@gmail.com", "Male");
		Student student3 = new Student("abc", "abc@gmail.com", "Female");
		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		model.addAttribute("studentAttribute", students);
		return "ifunless";
	}
	
	@GetMapping("/switchCase")
	public String giveSwitchCaseResults(Model model) {
		Student student1 = new Student("DEF", "DEF@gmail.com", "Male");
		Student student2 = new Student("Harshit", "Harshit@gmail.com", "Male");
		Student student3 = new Student("abc", "abc@gmail.com", "Female");
		Student student4 = new Student("xyz", "xyz@gmail.com", "other");
		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		model.addAttribute("studentAttribute", students);
		return "switchCaseUI";
	}
}
