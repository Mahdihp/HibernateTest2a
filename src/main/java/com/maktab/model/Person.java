package com.maktab.model;

import java.util.Set;

public class Person {
	public static final String REF = "Person";
	
	private Long id;

	private String name;
	
	private Set<Book> writtenBooks;
	/**
	 *  رابطه meny to meny
	 *
	 */
	private Set<Group> groups;

	public Person() {
	}

	public Person(String name) {
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
	
	public Set<Book> getWrittenBooks() {
		return writtenBooks;
	}
	public void setWrittenBooks(Set<Book> writtenBooks) {
		this.writtenBooks = writtenBooks;
	}
	
	public Set<Group> getGroups() {
		return groups;
	}
	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", writtenBooks Size =" + writtenBooks.size() +
				", groups Size =" + groups.size()+
				'}';
	}
}