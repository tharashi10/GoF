package com.orcl.design.observer;

public class IncrementalNumberGenerator extends NumberGenerator {

    private int start;
    private int end;
    private int delta;
    private int number;

    public IncrementalNumberGenerator(int start, int end, int delta){
        this.start = start;
        this.end = end;
        this.delta = delta;
    }
    
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int num = start ; num < end ; num +=delta){
            number = num;
            notifyObserver();
        }
    }
}
