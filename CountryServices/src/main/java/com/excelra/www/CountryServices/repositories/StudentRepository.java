package com.excelra.www.CountryServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelra.www.CountryServices.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
