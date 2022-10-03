package com.orcl.design.dao;

import java.util.List;

/*
 * Data Access Object Interface
 */
public interface InstructorDao {
    public List<Instructor> getAllInstructors();
    public Instructor getInstructor(int id);
    public void updateInstructor(Instructor instructor);
    public void deleteInstructor(Instructor instructor);
}
