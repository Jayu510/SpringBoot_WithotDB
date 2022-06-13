package com.jbk.SringBoot_WithoutDB.dao;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.jbk.SringBoot_WithoutDB.entity.Student;

public interface StudentDao {
	public String saveStudent(Student student);

	public List<Student> getAllStudent();

	public Student getStudent(int eid);

	public String updateStudent(Student student);

	public String deleteStudent(int eid);

	public List<Student> sortStudentonMarks();

	public List<Student> sortStudentonName();
}
