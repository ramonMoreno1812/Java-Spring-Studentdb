package com.example.JavaSrpingStudentdb.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.JavaSrpingStudentdb.Repository.StudentRepository;

import com.example.JavaSrpingStudentdb.Student.Student;

import org.springframework.stereotype.Service;

@Service
public class ServicesImpl implements Services{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll(); // method available to use in repo
	}

	@Override
	public void saveStudent(Student student) {
		this.studentRepository.save(student);
		
	}
	
	@Override
	public Student getStudentById(long id) {
		Optional<Student> optional = studentRepository.findById(id);
		Student student = null;
		if(optional.isPresent()) {
			student = optional.get();
		} else {
			throw new RuntimeException("Student not found for id :: " + id);
		}
		return student;
	}

	@Override
	public void deleteStudentById(long id) {
		this.studentRepository.deleteById(id);
		
	}

	@Override
	public void sortStudentByFirstName(List<Student> studnet) {
		
	}
}
