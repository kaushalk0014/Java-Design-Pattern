package com.learning.builder.design.pattern;

import java.util.List;

public abstract class StudentBuilder {

	private Integer id;
	
	private String name;
	 
	private Integer age;
	
	private String fatherName;
	
	private String motherName;
	
	private List<String> subject;

	public StudentBuilder setId(Integer id) {
		this.id = id;
		return this;
	}

	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public StudentBuilder setAge(Integer age) {
		this.age = age;
		return this;
	}

	public StudentBuilder setFatherName(String fatherName) {
		this.fatherName = fatherName;
		return this;
	}

	public StudentBuilder setMotherName(String motherName) {
		this.motherName = motherName;
		return this;
	}

	public StudentBuilder setSubject(List<String> subject) {
		this.subject = subject;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getFatherName() {
		return fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public List<String> getSubject() {
		return subject;
	}
	
	public Student build() {
		return new Student();
	} 
	
}
