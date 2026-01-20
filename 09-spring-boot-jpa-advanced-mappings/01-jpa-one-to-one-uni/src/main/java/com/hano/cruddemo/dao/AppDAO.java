package com.hano.cruddemo.dao;

import com.hano.cruddemo.entity.Instructor;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findById(int id);

    void delete(int id);
}
