package com.rm.SpringBootRest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rm.SpringBootRest.dao.EmployeeDAO;
import com.rm.SpringBootRest.model.Employee;

@RestController
@RequestMapping("/")
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	/* SAVE AN SINGLE EMPLOYEE IN DATABASE */
/**	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee emp){
	      return employeeDAO.save(emp);
	} 
*/	
	/* SAVE LIST EMPLOYEE IN DATABASE */
	@PostMapping(path="/employees", consumes = "application/json", produces = "application/json")
	public List<Employee> createEmployee(@RequestBody List<Employee> emp){
	      return employeeDAO.saveAll(emp);
	} 
	
	/* GET ALL EMPLOYEE */
	@GetMapping("/employees")
	 public List<Employee> getAllEmployees(){
		   return employeeDAO.findALL();
	   } 
	
	// Get a Single Note
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable(value = "id") Long empId) {
	    return employeeDAO.findById(empId);
	}
	
	/* UPDATE AN EMPLOYEE */
	
/**	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long empid, @Valid @RequestBody Employee empDetails)
	{
		Employee emp = employeeDAO.getEmployee(empid);
		if (emp==null){
			return ResponseEntity.notFound().build();
		}
		emp.setName(empDetails.getName());
		emp.setDesignation(empDetails.getDesignation());
		
		Employee updateEmployee =employeeDAO.save(emp);
		return ResponseEntity.ok().body(updateEmployee);
	} 
	*/
	// Update a Note
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable(value = "id") Long empid, @Valid @RequestBody Employee empDetails) 
	{
		 Employee emp = employeeDAO.findById(empid);

        emp.setName(empDetails.getName());
		emp.setDesignation(empDetails.getDesignation());

	    Employee updatedEmployee = employeeDAO.save(emp);
	    return updatedEmployee;
	}
	
	
	/* DELETE AN EMPLOYEE */ 
	
	/* @DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable(value="id") Long id){
		
		Employee emp = employeeDAO.getEmployee(id);
		if (emp==null){
			return ResponseEntity.notFound().build();
		}
		employeeDAO.delete(emp);
		return ResponseEntity.ok().build();
	} 
	*/ 
	
	 /* DELETE AN EMPLOYEE BY ID */ 
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteNote(@PathVariable(value = "id") Long empid) {
	    Employee emp = employeeDAO.findById(empid);
	    employeeDAO.delete(emp);

	    return ResponseEntity.ok().build();
	}
}
