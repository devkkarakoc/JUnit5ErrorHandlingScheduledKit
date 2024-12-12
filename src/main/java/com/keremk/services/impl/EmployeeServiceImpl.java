package com.keremk.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keremk.model.Employee;
import com.keremk.repository.EmployeeRepository;
import com.keremk.services.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public Employee findEmployeeById(Long id) {
		
	  Optional<Employee> optionalEmploye = employeeRepository.findById(id);
	  if(optionalEmploye.isPresent()) {
		  return optionalEmploye.get();
	  }else {
		  return null;
	  }
	  
	}
	
	

}
