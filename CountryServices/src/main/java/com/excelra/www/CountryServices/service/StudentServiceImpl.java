package com.excelra.www.CountryServices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelra.www.CountryServices.entities.Student;
import com.excelra.www.CountryServices.repositories.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {

	

	@Autowired
	StudentRepository repository;
	@Override
	public List<Student> getCustomers() {

		return repository.findAll();
	}

}
