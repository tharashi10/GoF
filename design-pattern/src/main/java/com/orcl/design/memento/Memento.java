package com.orcl.design.memento;


import java.util.ArrayList;
import java.util.List;

public class Memento {
    private int money;
    private List<String> fruits;

    Memento(int money){
        this.money = money;
        this.fruits = new ArrayList<String>();
    }

    public int getMoney(){
        return this.money;
    }

    public List<String> getFruits(){
        return new ArrayList<>(fruits);
    }

    void addFruits(String fruit){
        fruits.add(fruit);
    }
}
