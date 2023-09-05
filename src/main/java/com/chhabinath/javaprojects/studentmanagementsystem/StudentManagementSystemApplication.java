package com.chhabinath.javaprojects.studentmanagementsystem;

/**
 * The `StudentManagementSystemApplication` class is the entry point of the Student Management System application.
 * It is annotated with `@SpringBootApplication`, indicating that it is a Spring Boot application.
 * This class contains the `main` method, which is the starting point of the application.
 * 
 * @author: Chhabinath Sahoo
 * @version: 1.0
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication {

	/**
	 * The main method that starts the Student Management System application.
	 * 
	 * @param args Command-line arguments (not used in this application).
	 */

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

}
