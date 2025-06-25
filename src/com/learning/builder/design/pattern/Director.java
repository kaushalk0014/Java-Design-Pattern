package com.learning.builder.design.pattern;

public class Director {
	
	StudentBuilder studentBuilder;
	
	Director(StudentBuilder builder){
		this.studentBuilder=builder;
	}
	
	public Student createStudent() {
	
		if(studentBuilder instanceof EngineerStudentBuilder) {
			return createEngineerStudentBuilder();
		}else {
			return createMBAStudentBuilder();
		}
	}

	private Student createMBAStudentBuilder() {
		return studentBuilder.setAge(21).setId(101).setName("Rohan").build();
	}

	private Student createEngineerStudentBuilder() {
		return studentBuilder.setAge(21).setId(101).setName("Rohan").build();
	}

}
