package com.bd_codes.rest_api;

import java.util.LinkedList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class EmployeeService implements EmployeeInterface	{
	
	List<Employee> emps;
	
	public EmployeeService() {
		emps = new LinkedList<Employee>();
		emps.add(new Employee(1, "Aman Pandey", "aman@gmail.com"));
		emps.add(new Employee(1, "Aman Pandey", "aman@gmail.com"));
		emps.add(new Employee(1, "Aman Pandey", "aman@gmail.com"));
	}
	
	@Override
	public ResponseEntity<Employee> addEmployee(Employee e) {
		emps.add(e);
		ResponseEntity<Employee> res = new ResponseEntity<>(e, HttpStatus.OK);
		return res;
	}

	@Override
	public ResponseEntity<Employee> deleteEmployee(int id) {
		emps = emps.stream().filter(emp -> emp.empId != id).toList();
		ResponseEntity<Employee> res = new ResponseEntity<>(HttpStatus.OK);
		return res;
	}

	@Override
	public List<Employee> showAllEmployees() {
		return emps;
	}
}
