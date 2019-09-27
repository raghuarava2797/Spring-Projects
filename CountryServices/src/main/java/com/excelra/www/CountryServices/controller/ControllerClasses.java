package com.excelra.www.CountryServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelra.www.CountryServices.entities.Student;
import com.excelra.www.CountryServices.service.StudentService;

@RestController
public class ControllerClasses {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> customer()
	{
		
		return studentService.getCustomers();
	}
	
}
