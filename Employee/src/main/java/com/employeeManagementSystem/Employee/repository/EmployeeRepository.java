package com.employeeManagementSystem.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.employeeManagementSystem.Employee.entity.Employee;

@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
