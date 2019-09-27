package com.excelra.www.CountryServices.QueryResolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.excelra.www.CountryServices.entities.Student;
import com.excelra.www.CountryServices.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Component
public class StudentQueryResolver implements GraphQLQueryResolver {

@Autowired
    private StudentService studentService;


    public List<Student> getStudent(final int count)
    {
        return this.studentService.getCustomers(count);
    }



}
