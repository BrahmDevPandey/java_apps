package com.bd_codes.rest_api;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface EmployeeInterface {
	public ResponseEntity<Employee> addEmployee(Employee e);
	public ResponseEntity<Employee> deleteEmployee(int id);
	public List<Employee> showAllEmployees();
}
