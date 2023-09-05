package com.chhabinath.javaprojects.studentmanagementsystem.service.implementation;

/**
 * The `StudentServiceImplementation` class provides an implementation of the `StudentService` interface.
 * It handles business logic related to student management by interacting with the `StudentRepository`.
 * This class is responsible for retrieving, saving, updating, and deleting student records.
 * 
 * @author: Chhabinath Sahoo
 * @version: 1.0
 */
import java.util.List;

import org.springframework.stereotype.Service;

import com.chhabinath.javaprojects.studentmanagementsystem.entity.Student;
import com.chhabinath.javaprojects.studentmanagementsystem.repository.StudentRepository;
import com.chhabinath.javaprojects.studentmanagementsystem.service.StudentService;

@Service
public class StudentServiseImplementation implements StudentService {

	private StudentRepository studentRepository;

	/**
	 * Constructor to initialize the service with a `StudentRepository` instance.
	 * 
	 * @param studentRepository The repository responsible for data access
	 *                          operations.
	 */

	public StudentServiseImplementation(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	/**
	 * Retrieves a list of all students in the system.
	 * 
	 * @return A list of Student objects representing all students.
	 */

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	/**
	 * Saves a new student record in the system.
	 * 
	 * @param student The Student object to be saved.
	 * @return The saved Student object with assigned ID.
	 */

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	/**
	 * Retrieves a student by their unique identifier.
	 * 
	 * @param id The ID of the student to retrieve.
	 * @return The Student object if found, or null if not found.
	 */

	@Override
	public Student getStudentById(Long id) {

		return studentRepository.findById(id).get();
	}

	/**
	 * Updates an existing student record in the system.
	 * 
	 * @param student The Student object with updated information.
	 * @return The updated Student object.
	 */

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	/**
	 * Deletes a student record by their unique identifier.
	 * 
	 * @param id The ID of the student to delete.
	 */

	@Override
	public void deleteStudentById(Long id) {

		studentRepository.deleteById(id);

	}

}
