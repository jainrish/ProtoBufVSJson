package com.protobuf.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.protobuf.generated.LibraryProtos;
import com.protobuf.generated.LibraryProtos.Library.OrganizationType;
import com.protobuf.model.Book;
import com.protobuf.model.Libraries;
import com.protobuf.model.Library;

@Configuration
public class DaoConfig {

	private static final String BOOK_NAME = "Book";
	private static final String AUTHOR_NAME = "Author";
	private static final String ORGANIZATION_NAME = "Organization";

	@Bean
	LibraryProtos.Libraries libraryProtoDao() {
		return createLibrariesProtoObject(1000);
	}

	@Bean
	Libraries librariesModelDao() {
		return createLibrariesModelObject(1000);
	}

	private LibraryProtos.Libraries createLibrariesProtoObject(
			int listSize) {
		LibraryProtos.Book book = LibraryProtos.Book.newBuilder()
				.setAuthor(AUTHOR_NAME).setName(BOOK_NAME).setPages(400)
				.setBookID(1).build();
		LibraryProtos.Library library = LibraryProtos.Library.newBuilder()
				.setLibraryID(1).setOrganizationType(OrganizationType.ACADEMIC)
				.setOrganization(ORGANIZATION_NAME).addBooks(book).build();
		List<LibraryProtos.Library> libraryList = new ArrayList<LibraryProtos.Library>();
		for (int i = 0; i < listSize; i++) {
			libraryList.add(library);
		}
		LibraryProtos.Libraries libraries = LibraryProtos.Libraries
				.newBuilder().addAllLibrary(libraryList).build();

		return libraries;
	}

	private Libraries createLibrariesModelObject(int listSize) {
		Book book = new Book(1, 100, BOOK_NAME, AUTHOR_NAME);

		List<Book> books = new ArrayList<Book>();
		books.add(book);

		Library library = new Library(1,
				com.protobuf.model.OrganizationType.ACADEMIC, books,
				ORGANIZATION_NAME);
		List<Library> libraryList = Collections.nCopies(listSize, library);
		
		Libraries libraries = new Libraries();
		libraries.getLibraries().addAll(libraryList);

		return libraries;
	}
}
