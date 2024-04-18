package com.chainsys.methodoverriding;

import java.util.Scanner;

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
		Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0,studentID=0;
        while (name.isEmpty()) {
            System.out.print("Enter name: ");
            name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Please enter a valid name.");
            }
        }
        while (age <= 0) {
            System.out.print("Enter age: ");
            try {
                age = scanner.nextInt();
                if (age <=0) {
                    System.out.println("Age must be a positive integer. Please enter a valid age.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Age must be a positive integer. Please enter a valid age.");
            }
        }
        while (studentID <= 0) {
            System.out.print("Enter StudentID: ");
            try {
            	studentID = scanner.nextInt();
                if (studentID <=0) {
                    System.out.println("StudentID must be a positive integer. Please enter a valid StudentID.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. StudentID must be a positive integer. Please enter a valid StudentID.");
            }
        }


		Student student = new Student("name", age, studentID);
		Teacher teacher = new Teacher("Jane Smith", 35, "Mathematics");
		System.out.println("Student Details:");
		student.displayDetails();
		System.out.println();
		System.out.println("***********************");
		System.out.println();
		System.out.println("Teacher Details:");
		teacher.displayDetails();
	}
}
