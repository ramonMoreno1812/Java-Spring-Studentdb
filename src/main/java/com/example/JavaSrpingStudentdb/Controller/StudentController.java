package com.example.JavaSrpingStudentdb.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.JavaSrpingStudentdb.Services.Services;

import com.example.JavaSrpingStudentdb.Student.Student;

@Controller
public class StudentController {
	
	@Autowired
	private Services studentServices;
	
	// display list of students
		@GetMapping("/")// lives at
		public String viewHomePage(Model model) {
			model.addAttribute("listStudent", studentServices.getAllStudents());// call method from student service
			return "index";// return the html template
		}
		
		@GetMapping("/showNewStudentForm")
		public String showNewStudentForm(Model model) {
			Student student = new Student();
			model.addAttribute("student", student);
			return "new_student";
		}
		
		@PostMapping("/saveStudent")
		public String saveStudent(@ModelAttribute("student") Student student) {
			studentServices.saveStudent(student);
			return "redirect:/";
		}
		
		@GetMapping("/showFormForUpdate/{id}")
		public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
			Student student = studentServices.getStudentById(id);
			model.addAttribute("student", student);
			return "update_student";
			
		}
		
		@GetMapping("/deleteStudent/{id}")
		public String deleteStudent(@PathVariable(value = "id") long id) {
			this.studentServices.deleteStudentById(id);
			return "redirect:/";
		}

}
