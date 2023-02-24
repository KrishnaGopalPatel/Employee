package com.employeeManagementSystem.Employee.service;

import java.util.List;

import com.employeeManagementSystem.Employee.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	Employee savEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);
	


}
