package com.protobuf.model;

public final class Book {

	final Integer id;

	final Integer pages;

	final String name;

	final String author;

	public Integer getId() {
		return id;
	}

	public Integer getPages() {
		return pages;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public Book(Integer id, Integer pages, String name, String author) {
		this.id = id;
		this.pages = pages;
		this.name = name;
		this.author = author;
	}
}
