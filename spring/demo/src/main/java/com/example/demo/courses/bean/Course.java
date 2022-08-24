package com.example.demo.courses.bean;

public class Course {
	private long id;
	private String name;
	private String author;
	private String msg;
	
	public Course(long id, String name, String auth, String msg) {
		this.id = id;
		this.name = name;
		this.author = auth;
		this.msg = msg;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
	
	public String getMessage() {
		return msg;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + ", " + msg + "]";
	}	
}
