package com.hano.cruddemo.dao;

import com.hano.cruddemo.entity.Instructor;
import com.hano.cruddemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findById(int id);

    void delete(int id);

    InstructorDetail findInstructorDetailsById(int theId);

    void deleteInstructorDetailById(int theId);
}
