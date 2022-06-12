package com.jbk.SringBoot_WithoutDB.dao;

import java.util.List;

import com.jbk.SringBoot_WithoutDB.entity.Student;

public interface StudentDao {
	public String saveStudent(Student student);
	public List<Student> getAllStudent();
}
