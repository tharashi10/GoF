package com.orcl.design.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * 数を生成するオブジェクト
 */
public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObserver(){
        for (Observer o: observers){
            o.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}
