package com.jbk.SringBoot_WithoutDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.SringBoot_WithoutDB.dao.StudentDao;
import com.jbk.SringBoot_WithoutDB.entity.Student;
@Service
public class StudentService_impl implements StudentService {
@Autowired
private StudentDao dao;
	@Override
	public String saveStudent(Student student) {
		String msg=dao.saveStudent(student);
		return msg;
	}
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return dao.getAllStudent();
	}
	@Override
	public Student getStudent(int eid) {
		
		return dao.getStudent(eid);
	}
	@Override
	public String updateStudent(Student student) {
		
		return dao.updateStudent(student);
	}
	@Override
	public String deleteStudent(int eid) {
		String msg=dao.deleteStudent(eid);
		return msg;
	}
	@Override
	public List<Student> sortStudentonMarks() {
		List<Student>list=dao.sortStudentonMarks();
		return list;
	}
	@Override
	public List<Student> sortStudentonName() {
		List<Student>list=dao.sortStudentonName();
		return list;
	}
	

}
