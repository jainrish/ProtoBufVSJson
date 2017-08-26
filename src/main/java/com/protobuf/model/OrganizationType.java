package com.protobuf.model;

public enum OrganizationType {

	ACADEMIC(0),
	PROFESSIONAL(1),
	OTHERS(2);
	
	private Integer organizationType;
	
	private OrganizationType(Integer type) {
		organizationType = type;
	}
	
	public Integer getOrganizationType(){
		return organizationType;
	}
	
}
