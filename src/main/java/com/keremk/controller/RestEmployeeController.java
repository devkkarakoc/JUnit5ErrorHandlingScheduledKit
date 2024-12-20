package com.keremk.controller;

import com.keremk.dto.DtoEmployee;
import com.keremk.model.RootEntity;

public interface RestEmployeeController {
	
	
	
	public RootEntity<DtoEmployee> findEmployeeById(Long id);
		
	

}
