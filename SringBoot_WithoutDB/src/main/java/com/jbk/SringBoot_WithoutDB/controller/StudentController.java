package com.jbk.SringBoot_WithoutDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.SringBoot_WithoutDB.entity.Student;
import com.jbk.SringBoot_WithoutDB.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	StudentService service;

	@PostMapping("/saveStudent")
	public String saveStudent(@RequestBody Student student) {
		String msg = service.saveStudent(student);
		return msg;
	}

	@GetMapping("/getAllStudent")
	public List<Student> getAllStudent() {
		return service.getAllStudent();
	}

	@GetMapping("/getStudent/{eid}")
	public Object getStudent(@PathVariable int eid) {
		Student student = service.getStudent(eid);
		if (student != null) {
			return student;
		} else {
			return "Student not Found !!";
		}
	}

	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student student) {
		String msg = service.updateStudent(student);
		return msg;
	}

	@DeleteMapping("/deleteStudent/{eid}")
	public String deleteStudent(@PathVariable int eid) {
		String msg = service.deleteStudent(eid);
		return msg;
	}

	@GetMapping("/sortStudentonSalary")
	public List<Student> sortStudentonMarks() {
		List<Student> list = service.sortStudentonMarks();
		return list;
	}

	@GetMapping("/sortStudentOnName")
	public List<Student> sortStudentonName() {
		List<Student> list = service.sortStudentonName();
		return list;
	}
}
