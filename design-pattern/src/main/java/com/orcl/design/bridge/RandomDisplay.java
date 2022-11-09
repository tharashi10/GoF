package com.orcl.design.bridge;

import java.util.Random;

public class RandomDisplay extends Display {

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times){
        Random rand = new Random();
        int num = rand.nextInt(times+1);
        open();
        for (int i=0; i<num; i++){
            print();
        }
        close();
    };
    
}
