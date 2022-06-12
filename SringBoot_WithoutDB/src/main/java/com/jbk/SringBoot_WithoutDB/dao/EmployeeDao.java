package com.jbk.SringBoot_WithoutDB.dao;

import java.util.List;

import com.jbk.SringBoot_WithoutDB.entity.Employee;

public interface EmployeeDao {
	public String saveEmployee(Employee employee);

	public List<Employee> getAllEmployee();
	public Employee getEmployee(int eid);
	public String updateEmployee(Employee employee);

	public String deleteEmployee(int eid);

	public List<Employee> sortEmployeeOnSalary();
}
