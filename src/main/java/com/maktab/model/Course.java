package com.maktab.model;

import java.util.Set;

public class Course {
	public static final String REF = "Course";

	private Integer id;


	private String code;
	private String name;
	private Set<CourseGroup> courseGroups;

	public Course(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public Course() {
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Set<CourseGroup> getCourseGroups() {
		return courseGroups;
	}

	public void setCourseGroups(Set<CourseGroup> courseGroups) {
		this.courseGroups = courseGroups;
	}
}