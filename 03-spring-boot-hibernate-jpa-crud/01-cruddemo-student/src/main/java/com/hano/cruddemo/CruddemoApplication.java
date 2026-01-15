package com.hano.cruddemo;

import com.hano.cruddemo.dao.StudentDAO;
import com.hano.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (StudentDAO studentDAO) {
		return runner-> {
			//createStudent(studentDAO);

			createMultiStudent(studentDAO);

			//readStudent(studentDAO);

			//queryForStudents(studentDAO);

			//queryForStudentsByLastName(studentDAO);

			//updateStudent(studentDAO);

			//removeStudent(studentDAO);

			//removeAllStudent(studentDAO);


		};
	}

	private void removeAllStudent(StudentDAO studentDAO) {
		System.out.println("Deleting all Students....");
		int affected = studentDAO.deleteAll();

		System.out.println("Deleted Row Count: " + affected);
	}

	private void removeStudent(StudentDAO studentDAO) {
		int id = 3;

		System.out.println("Deleting Student id: " + id);
		studentDAO.delete(id);
	}

	private void updateStudent(StudentDAO studentDAO) {
		int id = 1;
		System.out.println("Getting student with id: " + id);

		Student theStudent = studentDAO.findById(1);

		System.out.println("Updating Student....");
		theStudent.setFirstName("Scooby");

		studentDAO.update(theStudent);

		System.out.println("Updated Student: " + theStudent);

	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findByLastName("Doe");

		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findAll();

		for (Student tempStudent: theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		System.out.println("Creating a new student.....");
		Student tempStudent = new Student("John", "Doe", "john@gmail.com");

		System.out.println("Saving the student....");
		studentDAO.save(tempStudent);

		System.out.println("Student saved, Generated id: " + tempStudent.getId());

		System.out.println("Retrieving student with id: " + tempStudent.getId());

		Student student = studentDAO.findById(tempStudent.getId());
		System.out.println("Found Student: " + student);
	}

	private void createMultiStudent(StudentDAO studentDAO) {
		System.out.println("Creating 3 new student objects.....");
		Student tempStudent1 = new Student("Hansel", "Varghese", "hansel@gmail.com");
		Student tempStudent2 = new Student("John", "Doe", "john@gmail.com");
		Student tempStudent3 = new Student("Mary", "Gogh", "mary@gmail.com");

		System.out.println("Saving the students");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {

		System.out.println("Creating a new student object.....");
		Student tempStudent = new Student("Paul", "Leno", "paul@gmail.com");

		System.out.println("Saving the student");
		studentDAO.save(tempStudent);

		System.out.println("Student Saved, Generated id: " + tempStudent.getId());
	}
}
