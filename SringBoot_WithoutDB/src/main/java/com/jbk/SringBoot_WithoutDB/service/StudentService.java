package com.jbk.SringBoot_WithoutDB.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.jbk.SringBoot_WithoutDB.entity.Student;

public interface StudentService {
	public String saveStudent(Student student);

	public List<Student> getAllStudent();

	public Student getStudent(int eid);

	public String updateStudent(Student student);

	public String deleteStudent(int eid);

	public List<Student> sortStudentonMarks();

	public List<Student> sortStudentonName();
}
