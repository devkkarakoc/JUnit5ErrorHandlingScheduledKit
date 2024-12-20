package com.keremk.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keremk.controller.RestEmployeeController;
import com.keremk.dto.DtoEmployee;
import com.keremk.model.RootEntity;
import com.keremk.services.IEmployeeService;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController{

	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/list/{id}")
	@Override
	public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(name = "id") Long id) {
		
		return ok(employeeService.findEmployeeById(id))             ;	
	}

}
