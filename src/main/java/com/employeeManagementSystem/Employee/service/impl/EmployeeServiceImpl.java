package com.employeeManagementSystem.Employee.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employeeManagementSystem.Employee.entity.Employee;
import com.employeeManagementSystem.Employee.repository.EmployeeRepository;
import com.employeeManagementSystem.Employee.service.EmployeeService;

import jakarta.persistence.Id;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee savEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}


	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
}
