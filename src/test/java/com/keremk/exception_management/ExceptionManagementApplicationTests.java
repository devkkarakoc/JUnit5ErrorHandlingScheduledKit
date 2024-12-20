package com.keremk.exception_management;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.keremk.dto.DtoEmployee;
import com.keremk.services.IEmployeeService;
import com.keremk.starter.ExceptionManagementApplication;

@SpringBootTest(classes = {ExceptionManagementApplication.class} )
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService employeeService;
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("before each çalıştı...");
	}
	
	@Test
	public void testFindEmployeeById() {
		
		DtoEmployee employeeById = employeeService.findEmployeeById(4L);
		assertNotNull(employeeById);
		//assertEquals(4, employeeById.getId());
//		if(employeeById!=null)
//		{
//			System.out.println("İsim : " + employeeById.getName());
//		}
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("AfterEach çalıştı");
	}
}
