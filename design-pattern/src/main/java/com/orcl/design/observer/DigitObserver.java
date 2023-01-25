package com.orcl.design.observer;

// 観察したObjectを数字で表す
public class DigitObserver implements Observer{

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("Digits Number = " + generator.getNumber());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
}
