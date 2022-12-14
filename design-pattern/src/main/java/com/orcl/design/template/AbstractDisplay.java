package com.orcl.design.template;

//public abstract class AbstractDisplay{
public interface AbstractDisplay{
    public abstract void open();
    public abstract void print();
    public abstract void close();

    /*
     * DisplayはAbstractDisplayで実装
     */
    //public final void display(){
    public default void display(){
        open();
        for (int i=0; i<5; i++){
            print();
        }
        close();
    }
}