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
		
		model.addAttribute("studentList", opiskelijaLista());
		
		return "hello";
	}
	
	private ArrayList<Student> opiskelijaLista() {
		ArrayList<Student> lista = new ArrayList<Student>();
		lista.add(new Student("Jane", "Porter"));
		lista.add(new Student("Me", "Tarzan"));
		lista.add(new Student("Cheeta", "TheChimp"));
		return lista;
		
	}
	

}
