package com.jbk.SringBoot_WithoutDB.service;

import java.util.List;

import com.jbk.SringBoot_WithoutDB.entity.Student;

public interface StudentService {
	public String saveStudent(Student student);
	public List<Student> getAllStudent();
}
