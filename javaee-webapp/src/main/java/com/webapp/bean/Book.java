package com.webapp.bean;

public class Book {

	private String name;
	private String author;
	private int totalPages;

	public Book() {

	}

	public Book(String name, String author, int totalPages) {
		super();
		this.name = name;
		this.author = author;
		this.totalPages = totalPages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

}
