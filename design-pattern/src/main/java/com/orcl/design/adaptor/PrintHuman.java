package com.orcl.design.adaptor;
public class PrintHuman extends Human implements Print{
    public PrintHuman(String name, int birthday){
        super(name, birthday);
    }
    public void printName(){
        showName();
    };
    public void printAge(){
        showBirthday();
    };
}