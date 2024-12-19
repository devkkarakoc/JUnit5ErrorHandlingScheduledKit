package com.keremk.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keremk.dto.DtoDepartment;
import com.keremk.dto.DtoEmployee;
import com.keremk.exception.BaseException;
import com.keremk.exception.ErrorMessage;
import com.keremk.model.Department;
import com.keremk.model.Employee;
import com.keremk.repository.EmployeeRepository;
import com.keremk.services.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public DtoEmployee findEmployeeById(Long id) {
		
		DtoEmployee dtoEmployee = new DtoEmployee();
		DtoDepartment dtoDepartment = new DtoDepartment();
		
	  Optional<Employee> optionalEmploye = employeeRepository.findById(id);
	  if(optionalEmploye.isPresent()) {
		  
		  BeanUtils.copyProperties(optionalEmploye.get(), dtoEmployee);
		  Department dboDepartment = optionalEmploye.get().getDepartment();
		  BeanUtils.copyProperties(dboDepartment, dtoDepartment);
		  dtoEmployee.setDepartment(dtoDepartment);
		  
		  return dtoEmployee;
	  }else {
		  throw new BaseException(new ErrorMessage(com.keremk.exception.MessageType.NO_RECORD_EXIST,id.toString()));
	  }
	  
	}
	
	

}
