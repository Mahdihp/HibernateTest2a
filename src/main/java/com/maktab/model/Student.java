package com.maktab.model;

import java.util.Set;

public class Student {
	public static final String REF = "Student";
	private Long id;

	private String code;
	private String name;
	
//	private Set<Course> writtenCourses;
	/**
	 *  رابطه meny to meny
	 *
	 */
	private Set<CourseGroup> courseGroups;

	public Student() {
	}

	public Student(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public Student(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<CourseGroup> getCourseGroups() {
		return courseGroups;
	}

	public void setCourseGroups(Set<CourseGroup> courseGroups) {
		this.courseGroups = courseGroups;
	}
}