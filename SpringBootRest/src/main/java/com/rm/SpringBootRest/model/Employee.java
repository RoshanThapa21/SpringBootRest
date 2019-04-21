package com.rm.SpringBootRest.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Employees")
@EntityListeners(AuditingEntityListener.class)

public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
      private Long id;
	  @NotBlank
      private String name;
	  @NotBlank
      private String designation; 
	  
 public Employee(){
		  
	  }
	   
	public Employee(Long id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}     
      
}
