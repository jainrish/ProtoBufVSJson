package com.protobuf.model;

import java.util.List;

public class Library {

	final Integer libraryID;

	final OrganizationType organizationType;

	final String organization;

	final List<Book> books;

	public Integer getLibraryID() {
		return libraryID;
	}

	public OrganizationType getOrganizationType() {
		return organizationType;
	}

	public String getOrganization() {
		return organization;
	}

	public List<Book> getBooks() {
		return books;
	}

	public Library(Integer libraryID, OrganizationType organizationType,
			List<Book> books, String organization) {
		this.libraryID = libraryID;
		this.organizationType = organizationType;
		this.books = books;
		this.organization = organization;
	}

}
