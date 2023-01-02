package com.emc.presentation.entity;

public class Student {
	private int id;
	private String name, surname, address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//El fa servir la DI de properties
	public Student() {}
	
	//El fa servir la DI de constructor
	public Student(int id, String name, String surname, String address) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.address = address;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", direction=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
}
