package com.nus.iss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nus.iss.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
