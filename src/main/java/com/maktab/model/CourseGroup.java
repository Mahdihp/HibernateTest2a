package com.maktab.model;

import java.util.Set;

public class CourseGroup {

    public static final String REF = "CourseGroup";
    private Long id;

    private Integer number;
    private Integer capecity;

	private Set<Student> students;
	private Course course;

    public CourseGroup() {
    }

    public CourseGroup(Integer number, Integer capecity, Course course) {
        this.number = number;
        this.capecity = capecity;
        this.course = course;
    }

    public CourseGroup(Integer number, Integer capecity) {
        this.number = number;
        this.capecity = capecity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCapecity() {
        return capecity;
    }

    public void setCapecity(Integer capecity) {
        this.capecity = capecity;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}