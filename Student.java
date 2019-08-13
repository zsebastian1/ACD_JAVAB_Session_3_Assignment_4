package ACADAssignments;

import java.util.Scanner;

public class Student {

	Scanner input = new Scanner(System.in);
	private String name;
	private String phoneNumber;
	private int rollNumber;
	private String classSubject;
	int grade1, grade2, grade3;
	
	public Student() {
		
	}
	public Student(String name, String phoneNumber, int rollNumber, String classSubject) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.rollNumber = rollNumber;
		this.classSubject = classSubject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getClassSubject() {
		return classSubject;
	}

	public void setClassSubject(String classSubject) {
		this.classSubject = classSubject;
	}
	
	public void studentInformation() {
	
	}
	public void studentInfo() {
		System.out.println("What is your name?");
		name = input.nextLine();
		System.out.println("Enter your phone number: ");
		phoneNumber = input.nextLine();
		System.out.println("Enter your student number: ");
		rollNumber = input.nextInt();
	}
	
	public void results() {
		System.out.println("What was your grade for Math class?");
		int grade1 = input.nextInt();
		System.out.println("What was your grade for Science class?");
		int grade2 = input.nextInt();
		System.out.println("What was your grade for Language Arts?");
		int grade3 = input.nextInt();
		
		
	}
	
	public void display() {
		System.out.println("What was your grade for Math class?");
		int grade1 = input.nextInt();
		System.out.println("What was your grade for Science class?");
		int grade2 = input.nextInt();
		System.out.println("What was your grade for Language Arts?");
		int grade3 = input.nextInt();
		
		System.out.println("This student's name is: " + name);
		System.out.println("This student's phone number is: " + phoneNumber);
		System.out.println("This student's roll number is: " + rollNumber);
		
		if((grade1 >= 70) && (grade1 <= 100)) {
			System.out.println("This student has passed Math.");
		} else {
			System.out.println("This student has failed Math.");
			
		}
		if((grade2 >= 70) && (grade2 <= 100)) {
			System.out.println("This student has passed Science.");
		} else {
			System.out.println("This student has failed Science.");
			
		}
		if((grade3 >= 70) && (grade3 <= 100)) {
			System.out.println("This student has passed Language Arts.");
		} else {
			System.out.println("This student has failed Language Arts.");
			
		}
	}
	
}
