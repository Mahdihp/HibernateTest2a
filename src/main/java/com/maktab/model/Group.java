package com.maktab.model;

import java.util.Set;

public class Group {
	public static final String REF = "Group";
	
	private Long id;

	private String name;
	
	private Set<Person> members;

	public Group() {
	}

	public Group(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Person> getMembers() {
		return members;
	}
	public void setMembers(Set<Person> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "Group{" +
				"id=" + id +
				", name='" + name + '\'' +
				", members size =" + members.size() +
				'}';
	}
}