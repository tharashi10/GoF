package com.orcl.design.observer;

// 観察したObjectを文字で表す
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
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
