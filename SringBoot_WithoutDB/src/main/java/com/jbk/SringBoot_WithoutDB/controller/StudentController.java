package com.jbk.SringBoot_WithoutDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
}
