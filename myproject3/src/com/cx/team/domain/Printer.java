package com.cx.team.domain;

public class Printer implements Equipment {
	private String name;
	private String type;
	public Printer() {
		super();
	}
	public Printer(String type,String name) {
		super();
		this.type = type;
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String getDescription() {
		return type + "(" + name + ")";
	}
	
	
}
