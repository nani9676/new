package com.orgnization.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orgnization.project.entities.Student;
import com.orgnization.project.repositories.StudentRepository;
import com.orgnization.project.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudentDetails(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> findAllStudentDetails() {
		// TODO Auto-generated method stub
		List<Student> list=studentRepository.findAll();
		return list;
	}
	

}
