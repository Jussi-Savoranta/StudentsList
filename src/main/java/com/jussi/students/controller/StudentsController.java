package com.jussi.students.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jussi.students.domain.Student;

@Controller
public class StudentsController {

	
	//@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@GetMapping(value = "/hello")
	public String printList(Model model) {
		
		ArrayList<Student> opiskelijat = new ArrayList<Student>();
		opiskelijat.add(new Student("Jane", "Tarzan"));
		opiskelijat.add(new Student("Me", "Tarzan"));
		opiskelijat.add(new Student("Cheeta", "TheChimp"));
		
		model.addAttribute("studentList", opiskelijat);
		return "hello";
	}
	

}
