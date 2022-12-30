package com.orgnization.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orgnization.project.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
