package com.chhabinath.javaprojects.studentmanagementsystem.repository;

/**
 * The `StudentRepository` interface provides data access operations for managing student records.
 * It extends the Spring Data JPA `JpaRepository` interface, which provides generic CRUD (Create, Read, Update, Delete) operations
 * for the `Student` entity. This interface is typically used to interact with a database or data store
 * to perform operations related to student data.
 * 
 * @author: Chhabinath Sahoo
 * @version: 1.0
 */
import org.springframework.data.jpa.repository.JpaRepository;
import com.chhabinath.javaprojects.studentmanagementsystem.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
