package com.design.pattern.builder;

public class Student {
	private String firstName;
	private String lastName;
	private String school;
	private String college;
	private String company;
	private String city;

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName
				+ ", school=" + school + ", college=" + college + ", company="
				+ company + ", city=" + city + ", country=" + country
				+ ", zipCode=" + zipCode + ", state=" + state + ", age=" + age
				+ ", xMarks=" + xMarks + ", xiiMarks=" + xiiMarks + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getxMarks() {
		return xMarks;
	}

	public void setxMarks(int xMarks) {
		this.xMarks = xMarks;
	}

	public int getXiiMarks() {
		return xiiMarks;
	}

	public void setXiiMarks(int xiiMarks) {
		this.xiiMarks = xiiMarks;
	}

	private String country;
	private String zipCode;
	private String state;
	private int age;
	private int xMarks;
	private int xiiMarks;

	static class StudentBuilder {
		private Student student;
		private String firstName;
		private String lastName;
		private String school;
		private String college;
		private String company;
		private String city;
		private String country;
		private String zipCode;
		private String state;
		private int age;
		private int xMarks;
		private int xiiMarks;

		StudentBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		StudentBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		StudentBuilder school(String school) {
			this.school = school;
			return this;
		}

		StudentBuilder college(String college) {
			this.college = college;
			return this;
		}

		StudentBuilder city(String city) {
			this.city = city;
			return this;
		}

		StudentBuilder country(String country) {
			this.country = country;
			return this;
		}

		StudentBuilder zipCode(String zipCode) {
			this.zipCode = zipCode;
			return this;
		}

		StudentBuilder state(String state) {
			this.state = state;
			return this;
		}

		StudentBuilder age(int age) {
			this.age = age;
			return this;
		}

		StudentBuilder xiiMarks(int xiiMarks) {
			this.xiiMarks = xiiMarks;
			return this;
		}

		StudentBuilder xMarks(int xMarks) {
			this.xMarks = xMarks;
			return this;
		}

		public Student build() {
			student = new Student();
			student.age = this.age;
			student.xiiMarks = this.xiiMarks;
			student.xMarks = this.xMarks;
			student.firstName = this.firstName;
			student.lastName = this.lastName;
			student.school = this.school;
			student.college = this.college;
			student.company = this.company;
			student.city = this.city;
			student.country = this.country;
			student.zipCode = this.zipCode;
			student.state = this.state;
			return student;

		}
	}
}
