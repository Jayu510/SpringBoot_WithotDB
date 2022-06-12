package com.jbk.SringBoot_WithoutDB.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.SringBoot_WithoutDB.entity.Employee;
import com.jbk.SringBoot_WithoutDB.service.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@PostMapping(value="/saveEmployee")
public String saveEmployee(@RequestBody Employee employee) {
	String msg=	service.saveEmployee(employee);
	return msg;
}
	@GetMapping(value="/getAllEmployee")
	public List<Employee> getAllEmployee(){
		return service.getAllEmployee();
	}
	@GetMapping(value="/getEmployee/{eid}")
	public Object getEmployee(@PathVariable int eid) {
		Employee employee=service.getEmployee(eid);
		if(employee !=null) {
			return employee;
		}
		else {
			return "Employee not found  !!";
		}
	}
	/*@GetMapping(value="/getEmployeeByParam")
	public Object getEmployeeByParam(@RequestParam int eid) {
		Employee employee=service.getEmployee(eid);
		if(employee !=null) {
			return employee;
		}
		else {
			return "Employee not found  !!";
		}
	}*/
	@PutMapping(value="updateEmployee")
	public String updateEmployee(@RequestBody Employee employee) {
		String msg=service.updateEmployee(employee);
					return msg;
		}
	@DeleteMapping("/deleteEmployee/{eid}")
	public String deleteEmployee(@PathVariable int eid) {
		String msg = service.deleteEmployee(eid);
		return msg;
	}
	@GetMapping("/sortEmployeeOnSalary")
	public List<Employee> sortEmployeeOnSalary(){
		List<Employee> list = service.sortEmployeeOnSalary();
		return list;
}
}
