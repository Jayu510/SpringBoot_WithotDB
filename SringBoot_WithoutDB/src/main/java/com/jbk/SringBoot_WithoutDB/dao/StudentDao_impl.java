package com.jbk.SringBoot_WithoutDB.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

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

	@Override
	public Student getStudent(int eid) {
		Student student1=null;
		for (Student student : list) {
			if(eid==student.getEid()) {
				student1=student;
				break;
			}
		}
		return student1;
	}

	@Override
	public String updateStudent(Student student) {
		String s="Student details not update.... !!";
		for (Student student2 : list) {
			if(student.getEid()==student2.getEid()) {
				s="Record of Student "+student.getEid()+" is updaed Successfully";
				break;
			}
		}
		return s;
	}

	@Override
	public String deleteStudent(int eid) {
		String msg="Record not Available...!!!";
		for (Student student : list) {
			if(student.getEid()==eid)
				list.remove(student);
			msg="Student Record Deleted !! ";
			break;
		}
		return msg;
	}

	@Override
	public List<Student> sortStudentonMarks() {
		list.sort((e1, e2) -> {
			Double marks=e1.getMarks();
			Double marks2=e2.getMarks();
			return marks.compareTo(marks2);
		});
		return list;
	}

	@Override
	public List<Student> sortStudentonName() {
		list.sort((e1,e2)->{
			String name=e1.getName();
			String name1=e2.getName();
			return name.compareTo(name1);
		});
		return list;
	}

}
