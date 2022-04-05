package com.example.JavaSrpingStudentdb.Services;

import java.util.List;

import com.example.JavaSrpingStudentdb.Student.Student;


public interface Services {
	
	List <Student> getAllStudents();
	
	void saveStudent(Student student);
	
	Student getStudentById(long id);
	
	void deleteStudentById(long id);
	
	void sortStudentByFirstName(List<Student> studnet);

}
