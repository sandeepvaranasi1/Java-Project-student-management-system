package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Student;

public interface StudentServices {
	String addStudent(Student st);
	String updateStudent(Student st);
	String deleteStudent(int univId);
	Student searchStudent(int univId);
	List<Student> fetchAllStudents();	
}
