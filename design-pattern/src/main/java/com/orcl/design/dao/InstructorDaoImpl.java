package com.orcl.design.dao;

import java.util.ArrayList;
import java.util.List;

/*
 * インターフェースを実装した具体クラス.
 */
public class InstructorDaoImpl implements InstructorDao{
    private List<Instructor> instructors;

    // public修飾子を明示指定
    public InstructorDaoImpl(){
        //Factory ptn
        instructors = new ArrayList<Instructor>();
        Instructor instructor1 = new Instructor("Hoge", 0);
        Instructor instructor2 = new Instructor("Foo", 1);
        Instructor instructor3 = new Instructor("Bar", 2);
        instructors.add(instructor1);
        instructors.add(instructor2);
        instructors.add(instructor3);
    }
    @Override
    public List<Instructor> getAllInstructors(){
        return instructors;
    }
    @Override
    public Instructor getInstructor(int id){
        return instructors.get(id);
    }
    @Override
    public void updateInstructor(Instructor instructor){
        instructors.get(instructor.getId()).setName(instructor.getName());
        System.out.println("Instractor: ID=" + instructor.getId() + ", updated in DB.");
    }
    public void deleteInstructor(Instructor instructor){
        instructors.remove(instructor.getId());
        System.out.println("Instractor: ID=" + instructor.getId() + ", deleted from DB.");
    }

}
