package com.example.demo.courses.controller;

import java.util.Arrays;	
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.courses.bean.Course;

@RestController
public class CourseController {
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(new Course(1, "Learning Spring", "BD Pandey", "Hello"),
				new Course(2, "Learning Microservices", "BD Pandey", "Hello"));
	}  
	
	@GetMapping("/courses/1")
	public Course getCourseDetails() {
		return new Course(1, "Learning SpringBoot", "BD Pandey", "Hello");
	}
	
	@GetMapping("/test")
	public String getTestResult() {
		return new String("<p>This is the result of the test. <br> It also uses the br tag <br> <a href=\"/details\"> Click me </a>.</p>");
	}
	
	@GetMapping("/details")
	public String getDetails() {
		return new String("<p>This is t	he details page.</p>");
	}
}
