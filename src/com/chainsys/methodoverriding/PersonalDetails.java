package com.chainsys.methodoverriding;

class Person {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Student extends Person {
	public int studentId;
	
	public Student(String name, int age, int studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Student ID: " + studentId);
	}
}

class Teacher extends Person {
	private String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Subject: " + subject);
	}
}

public class PersonalDetails {
	public static void main(String[] args) {
		
		Student student = new Student("John Doe", 20, 1001);
		Teacher teacher = new Teacher("Jane Smith", 35, "Mathematics");
		System.out.println("Student Details:");
		student.displayDetails();
		System.out.println("***********************");
		System.out.println("Teacher Details:");
		teacher.displayDetails();
	}
}
