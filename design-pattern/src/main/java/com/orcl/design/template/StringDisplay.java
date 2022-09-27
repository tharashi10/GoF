package com.orcl.design.template;

public class StringDisplay extends AbstractDisplay{
    private String str;
    private int width;

    // Constructor
    public StringDisplay(String str){
        this.str = str;
    }

    @Override
    public void open(){
        printLine();
    }
    @Override
    public void print(){
        System.out.println("|" + str + "|");
    }

    @Override
    public void close(){
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i=0; i<width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}