package com.example.JavaSrpingStudentdb.Student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity// this class is a table in sql
@Table(name = "student") // create table in SQL named student
public class Student {
	
	@Id
	@SequenceGenerator(// for primary keys auto increment
			name = "student_sequence", // name of this particular sequence Generator
			sequenceName = "student_sequence",
			allocationSize = 1 // auto increment by 1 each new student
			)
	@GeneratedValue(// how to generate particular values for the Student ID
			strategy = GenerationType.SEQUENCE,//Using sequence to generate values
			generator = "student_sequence"
			
			)
	private long StudentId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	
	@Column(name = "email")
	private String email;
	
	public long getStudentId() {
		return StudentId;
	}
	public void setStudentId(long studentId) {
		StudentId = studentId;
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Student(long studentId, String firstName, String lastName, String dateOfBirth, String email) {
//		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		StudentId = studentId;
	}
	
	public Student(String firstName, String lastName, String dateOfBirth, String email) {
		/* super(); */
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
	}
	
	public Student() {
		
	}

}
