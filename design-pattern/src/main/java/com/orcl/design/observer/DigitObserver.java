package com.orcl.design.observer;

public class DigitObserver implements Observer{

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("Digits Number = " + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}
    }
}
