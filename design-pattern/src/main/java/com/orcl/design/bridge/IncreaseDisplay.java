package com.orcl.design.bridge;

public class IncreaseDisplay extends CountDisplay{
    private int step;

    public IncreaseDisplay(DisplayImpl impl, int step) {
        super(impl);
        this.step = step;
    }

    public void increaseDisplay(int level){
        int cnt = 0 ;
        for (int i=0; i<level ; i++){
            multiDisplay(cnt);
            cnt+=step;
        }
    }
}
