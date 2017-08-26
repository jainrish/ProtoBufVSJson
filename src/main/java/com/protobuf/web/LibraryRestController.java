package com.protobuf.web;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.protobuf.generated.LibraryProtos;
import com.protobuf.model.Libraries;

@RestController
public class LibraryRestController {

	@Autowired
	LibraryProtos.Libraries librariesProto;

	@Autowired
	Libraries librariesModel;

	@RequestMapping("/librariesProto")
	@Produces("application/x-protobuf")
	public LibraryProtos.Libraries getBookByID() {
		return librariesProto;
	}

	@RequestMapping("/librariesJSON")
	@Produces("application/json")
	public Libraries getLibraries() {
		return librariesModel;
	}

}
