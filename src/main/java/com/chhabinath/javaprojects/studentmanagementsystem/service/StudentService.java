package com.chhabinath.javaprojects.studentmanagementsystem.service;

/**
 * This interface defines the contract for managing student data in a student
 * management system. It provides methods for retrieving, saving, updating, and
 * deleting student records.
 *
 * @author Chhabinath Sahoo
 * @version 1.0
 */
import java.util.List;

import com.chhabinath.javaprojects.studentmanagementsystem.entity.Student;


public interface StudentService {

	/**
	 * Retrieves a list of all students in the system.
	 *
	 * @return A list of Student objects representing all students.
	 */
	List<Student> getAllStudents();

	/**
	 * Saves a new student record in the system.
	 *
	 * @param student The Student object to be saved.
	 * @return The saved Student object with assigned ID.
	 */
	Student saveStudent(Student student);

	/**
	 * Retrieves a student by their unique identifier.
	 *
	 * @param id The ID of the student to retrieve.
	 * @return The Student object if found, or null if not found.
	 */
	Student getStudentById(Long id);

	/**
	 * Updates an existing student record in the system.
	 *
	 * @param student The Student object with updated information.
	 * @return The updated Student object.
	 */
	Student updateStudent(Student student);

	/**
	 * Deletes a student record by their unique identifier.
	 *
	 * @param id The ID of the student to delete.
	 */
	void deleteStudentById(Long id);

}
