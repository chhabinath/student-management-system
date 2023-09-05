package com.chhabinath.javaprojects.studentmanagementsystem.controller;

/**
 * The `StudentController` class handles HTTP requests related to student
 * management in a web application. It provides methods for listing, creating,
 * editing, updating, and deleting student records. This controller integrates
 * with the `StudentService` to perform these operations.
 * 
 * @author: Chhabinath Sahoo
 * @version 1.0
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.chhabinath.javaprojects.studentmanagementsystem.entity.Student;
import com.chhabinath.javaprojects.studentmanagementsystem.service.StudentService;


@Controller
public class StudentController {

	private StudentService studentService;

	/**
	 * Constructor to initialize the controller with a `StudentService` instance.
	 * 
	 * @param studentService The service responsible for managing student data.
	 */
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	/**
	 * Handles GET requests to list all students and display them in a view.
	 * 
	 * @param model The model for adding attributes to the view.
	 * @return The name of the view template (e.g., "students").
	 */

	@GetMapping("/students")
	public String listStudents(Model model) {

		model.addAttribute("students", studentService.getAllStudents());
		return "students";

	}

	/**
	 * Handles GET requests to display a form for creating a new student record.
	 * 
	 * @param model The model for adding attributes to the view.
	 * @return The name of the view template for creating a student (e.g.,
	 *         "create_student").
	 */

	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}

	/**
	 * Handles POST requests to save a new student record.
	 * 
	 * @param student The student data from the form.
	 * @return A redirection to the list of students.
	 */

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}

	/**
	 * Handles GET requests to display a form for editing an existing student
	 * record.
	 * 
	 * @param id    The unique identifier of the student to edit.
	 * @param model The model for adding attributes to the view.
	 * @return The name of the view template for editing a student (e.g.,
	 *         "edit_student").
	 */
	@GetMapping("/students/edit/{id}")
	public String editStudentData(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";

	}

	/**
	 * Handles POST requests to update an existing student record.
	 * 
	 * @param id      The unique identifier of the student to update.
	 * @param student The updated student data from the form.
	 * @param model   The model for adding attributes to the view.
	 * @return A redirection to the list of students.
	 */

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {

		Student editStudent = studentService.getStudentById(id);

		editStudent.setId(id);
		editStudent.setFirstName(student.getFirstName());
		editStudent.setLastName(student.getLastName());
		editStudent.setEmail(student.getEmail());

		studentService.updateStudent(editStudent);

		return "redirect:/students";

	}

	/**
	 * Handles GET requests to delete an existing student record.
	 * 
	 * @param id The unique identifier of the student to delete.
	 * @return A redirection to the list of students.
	 */
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {

		studentService.deleteStudentById(id);
		return "redirect:/students";

	}

}
