package com.protobuf.model;

import java.util.ArrayList;
import java.util.List;

public class Libraries {
	
	private List<Library> libraryList;
	
	public List<Library> getLibraries(){
		if(libraryList == null){
			this.libraryList = new ArrayList<Library>();
		}
		return libraryList;
	}
}
