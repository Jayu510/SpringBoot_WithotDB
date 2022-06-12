package com.jbk.SringBoot_WithoutDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.SringBoot_WithoutDB.dao.EmployeeDao;
import com.jbk.SringBoot_WithoutDB.entity.Employee;
@Service
public class EmployeeService_impl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
		@Override
		public String saveEmployee(Employee employee) {
			// TODO Auto-generated method stub
			String msg= dao.saveEmployee(employee);
			return msg;
		}
		@Override
		public List<Employee> getAllEmployee() {
			// TODO Auto-generated method stub
			List<Employee> list=dao.getAllEmployee();
			return list;
		}
		@Override
		public Employee getEmployee(int eid) {
		
			return dao.getEmployee(eid);
		}
		@Override
		public String updateEmployee(Employee employee) {
	
			return dao.updateEmployee(employee);
		}
		@Override
		public String deleteEmployee(int eid) {
			String msg = dao.deleteEmployee(eid);
			return null;
		}
		@Override
		public List<Employee> sortEmployeeOnSalary() {
			List<Employee> list =dao.sortEmployeeOnSalary();
			return list;
		}

}
