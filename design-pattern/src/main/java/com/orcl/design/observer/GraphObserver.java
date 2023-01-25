package com.orcl.design.observer;

public class GraphObserver implements Observer{
    
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("Graph Observer.");
        int count = generator.getNumber();
        for (int i=0; i<count ; i++){
            System.out.print("+");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
