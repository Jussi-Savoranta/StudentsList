package com.jussi.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jussi.students.domain.Student;

@Controller
public class StudentsController {
	
	Student studentJane = new Student("Jane", "Tarzan");
	Student studentTarzan = new Student("Me", "Tarzan");
	Student studentCheeta = new Student("Cheeta", "TheChimp");

	@RequestMapping("/hello")
	public String printList() {
		
		System.out.println(studentJane.toString());
		
		return "hello";
	}
}
