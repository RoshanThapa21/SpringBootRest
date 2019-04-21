package com.rm.SpringBootRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rm.SpringBootRest.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
