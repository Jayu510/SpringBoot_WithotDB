package com.jbk.SringBoot_WithoutDB.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jbk.SringBoot_WithoutDB.entity.Student;

@Repository
public class StudentDao_impl implements StudentDao {
	List<Student> list = new ArrayList<>();

	@Override
	public String saveStudent(Student student) {
		list.add(student);
		return "Saved !!";
	}

	@Override
	public List<Student> getAllStudent() {
		
		return list;
	}

}
