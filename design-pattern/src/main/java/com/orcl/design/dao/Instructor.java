package com.orcl.design.dao;


// これはValue Object
public class Instructor {
    private String name;
    private int id;

    Instructor(String name,int id){
        this.name = name;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}
