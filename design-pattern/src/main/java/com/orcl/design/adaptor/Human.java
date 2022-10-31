package com.orcl.design.adaptor;
public class Human {
    private String name;
    private int birthday;

    public Human(String name, int birthday){
        this.name = name;
        this.birthday = birthday;
    }
    public void showName(){
        System.out.println(name);
    }
    public void showBirthday(){
        System.out.println(birthday);
    }
}
