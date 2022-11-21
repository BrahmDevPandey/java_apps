package com.bd_codes.rest_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeInterface emp;
	
	@GetMapping("/getemployees")
	public List<Employee> getEmployees() {
		return emp.showAllEmployees();
	}
}
