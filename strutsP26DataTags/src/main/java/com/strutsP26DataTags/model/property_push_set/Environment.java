package com.strutsP26DataTags.model.property_push_set;

public class Environment {
	private String name, version;
	
	public Environment() {}
	
	public Environment(String name, String version) {
		this.name = name;
		this.version = version;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getVersion() {
		return version;
	}
	
}
