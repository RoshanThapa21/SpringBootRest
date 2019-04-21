package com.rm.SpringBootRest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rm.SpringBootRest.model.Employee;
import com.rm.SpringBootRest.repository.EmployeeRepository;

@Service
public class EmployeeDAO {
     
	@Autowired
	EmployeeRepository employeeRepository;
	
	        /* SAVE EMPLOYEE */
	   public Employee save(Employee emp){
		return employeeRepository.save(emp);  
	  } 
	   
	      /* SAVE LIST OF EMPLOYEE */
	   
		public List<Employee> saveAll(List<Employee> emp) {
			return employeeRepository.saveAll(emp);
		} 
	      
	        /* SEARCH ALL EMPLOYEE */
	   
	   public List<Employee> findALL(){
		   return employeeRepository.findAll();
	   }
	       
	    
	   /* GET EMPLOYEE */
	       public Employee findById(Long id){
	    	  return employeeRepository.findById(id).orElse(null);
	      }
	    
	   
	        /* DELETE EMPLOYEE */
	       public void delete(Employee emp){
	    	   employeeRepository.delete(emp);
	       }
	      
	       
	       /* DELETE EMPLOYEE BY ID */
	      public void deleteById(Long id){
	    	   employeeRepository.deleteById(id);
	       }

		
}
