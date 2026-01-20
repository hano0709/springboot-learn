package com.hano.cruddemo;

import com.hano.cruddemo.dao.AppDAO;
import com.hano.cruddemo.entity.Instructor;
import com.hano.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO){

		return runner -> {
			//createInstructor(appDAO);

			//findInstructor(appDAO);

			//removeInstructor(appDAO);

			//findInstructorDetail(appDAO);

			deleteInstructorDetail(appDAO);
		};
	}

	private void deleteInstructorDetail(AppDAO appDAO) {

		int id = 3;
		System.out.println("Deleting instructor detail id: " + id);

		appDAO.deleteInstructorDetailById(id);

		System.out.println("Done");
	}

	private void findInstructorDetail(AppDAO appDAO) {
		int id = 1;

		InstructorDetail instructorDetail = appDAO.findInstructorDetailsById(id);

		System.out.println("tempInstructorDetail: " + instructorDetail);

		System.out.println("The associated instructor: " + instructorDetail.getInstructor());
	}

	private void removeInstructor(AppDAO appDAO) {

		int id = 1;
		System.out.println("Deleting instructor id: " + id);
		appDAO.delete(id);

		System.out.println("Done");
	}

	private void findInstructor(AppDAO appDAO) {

		int theId = 1;
		System.out.println("Finding Instrucotr id: " + theId);
		Instructor theInstructor = appDAO.findById(theId);

		System.out.println("tempInstructor: " + theInstructor);
		System.out.println("the associated instructor detail: " + theInstructor.getInstructorDetail());
	}

	private void createInstructor(AppDAO appDAO) {

//		Instructor tempInstructor = new Instructor("Chad", "Darby", "darby@gmail.com");
//
//		InstructorDetail tempInstructorDetail = new InstructorDetail("https://www.luv2code.com/youtube", "Luv 2 code!!!");

		Instructor tempInstructor = new Instructor("Madhu", "Patel", "madhu@gmail.com");

		InstructorDetail tempInstructorDetail = new InstructorDetail("https://www.luv2code.com/youtube", "Guitar");

		tempInstructor.setInstructorDetail(tempInstructorDetail);

		System.out.println("Saving Instructor: " + tempInstructor);
		appDAO.save(tempInstructor);
		System.out.println("Done");
	}
}
