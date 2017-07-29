package com.design.pattern.builder;

public class Client {
	public static void main(String[] args) {
		Student student = new Student.StudentBuilder().age(12)
				.lastName("kkapoor").firstName("prateek").city("lucknow")
				.college("UPTU").country("india").build();
		System.out.println(student.toString());
	}

}
