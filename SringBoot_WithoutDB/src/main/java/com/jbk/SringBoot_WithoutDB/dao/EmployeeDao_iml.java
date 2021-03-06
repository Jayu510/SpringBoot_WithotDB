
package com.jbk.SringBoot_WithoutDB.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jbk.SringBoot_WithoutDB.entity.Employee;

@Repository
public class EmployeeDao_iml implements EmployeeDao {
	List<Employee> list = new ArrayList<>();

	@Override
	public String saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		list.add(employee);
		return "Saved !!";
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Employee getEmployee(int eid) {
		Employee employee = null;
		for (Employee emp : list) {
			if (eid == emp.getEid()) {
				employee = emp;
				break;
			}
		}
		return employee;
	}

	@Override
	public String updateEmployee(Employee employee) {
		String s1 = "Record not Found...!!!";

		for (Employee emp : list) {
			if (employee.getEid() == emp.getEid()) {
				if (employee.getName() != null) {
					emp.setName(employee.getName());
				}
				if (employee.getSalary() != 0) {
					emp.setSalary(employee.getSalary());
				}
				s1 = "Record of Employee " + employee.getEid() + " is Updated Succefuly";
				break;
			}
		}
		return s1;
	}

	@Override
	public String deleteEmployee(int eid) {
		String msg = "Record not Available...!!!";

		for (Employee employee : list) {
			if (employee.getEid() == eid) {
				list.remove(employee);
				msg = "Deleted !!";
				break;
			}
		}

		return msg;
	}

	@Override
	public List<Employee> sortEmployeeOnSalary() {
		list.sort((e1, e2) -> {
			Double sal1 = e1.getSalary();
			Double sal2 = e2.getSalary();

			return sal1.compareTo(sal2);
		});

		return list;

	}

}
