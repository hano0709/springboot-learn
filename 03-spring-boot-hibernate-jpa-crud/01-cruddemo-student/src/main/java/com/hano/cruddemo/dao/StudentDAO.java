package com.hano.cruddemo.dao;

import com.hano.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save (Student student);

    Student findById (int id);

    List<Student> findAll();

    List<Student> findByLastName(String lName);

    void update (Student student);

    void delete (int id);

    int deleteAll ();
}
