package com.chhabinath.javaprojects.studentmanagementsystem.entity;

/**
 * The `Student` class represents a student entity in a student management
 * system. It is an entity class that is typically used to map to a database
 * table named "students." Each `Student` object holds information about a
 * student, including their unique ID, first name, last name, and email address.
 * 
 * @author: Chhabinath Sahoo 
 * @version: 1.0
 */

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "email", nullable = false)
	private String email;

	/**
	 * Default constructor for creating an empty `Student` object.
	 */
	public Student() {
		super();
	}

	/**
	 * Constructor for creating a `Student` object with specified attributes.
	 * 
	 * @param firstName The first name of the student.
	 * @param lastName  The last name of the student.
	 * @param email     The email address of the student.
	 */

	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	/**
	 * Retrieves the unique identifier (ID) of the student.
	 * 
	 * @return The ID of the student.
	 */

	public Long getId() {
		return id;
	}

	/**
	 * Sets the unique identifier (ID) of the student.
	 * 
	 * @param id The ID to set for the student.
	 */

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Retrieves the first name of the student.
	 * 
	 * @return The first name of the student.
	 */

	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of the student.
	 * 
	 * @param firstName The first name to set for the student.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Retrieves the last name of the student.
	 * 
	 * @return The last name of the student.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of the student.
	 * 
	 * @param lastName The last name to set for the student.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Retrieves the email address of the student.
	 * 
	 * @return The email address of the student.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email address of the student.
	 * 
	 * @param email The email address to set for the student.
	 */

	public void setEmail(String email) {
		this.email = email;
	}

}
