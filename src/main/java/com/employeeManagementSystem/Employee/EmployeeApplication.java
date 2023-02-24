package com.employeeManagementSystem.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employeeManagementSystem.Employee.entity.Employee;
import com.employeeManagementSystem.Employee.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Employee employee1 =new Employee((long) 1, "Krishna", "Java", "Mumbai");
		 * employeeRepository.save(employee1); Employee employee2 =new Employee((long)
		 * 2, "Deepak", "Java", "Mumbai"); employeeRepository.save(employee2); Employee
		 * employee3 =new Employee((long) 3, "Ganesh", "Java", "Mumbai");
		 * employeeRepository.save(employee3); Employee employee4 =new Employee((long)
		 * 4, "Ganesh", "Java", "Mumbai"); employeeRepository.save(employee4);
		 */
		
		
	}
	
}
