package com.orgnization.project.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.orgnization.project.entities.Student;

@Component
public interface StudentService {

	Student saveStudentDetails(Student student);

	List<Student> findAllStudentDetails();



}
