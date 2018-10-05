package com.maktab.model;

public class Book {
	public static final String REF = "Book";
	
	private Long id;

	private String name;
	
	private Person author;

	public Book() {
	}

	public Book(String name, Person author) {
		this.name = name;
		this.author = author;
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
	
	public Person getAuthor() {
		return author;
	}
	public void setAuthor(Person author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", name='" + name + '\'' +
				", author=" + author +
				'}';
	}
}