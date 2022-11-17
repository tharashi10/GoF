package com.orcl.design.strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random rand;
    private int prevHandValue=0;
    private int currentHandValue=0;

    private int[][] history={
        {1,1,1},
        {1,1,1},
        {1,1,1}
    };

    public ProbStrategy(int seed) {
        rand = new Random(seed);
    }

    @Override
    public Hand nextHand() { // 0-3, 3-8, 8-15
        int bet = rand.nextInt(getSum(currentHandValue));
        int handvalue = 0;
        if (bet < history[currentHandValue][0]){
            handvalue = 0;
        }else if (bet < history[currentHandValue][0]+history[currentHandValue][1]){
            handvalue = 1;
        } else{
            handvalue =2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    private int getSum(int handvalue) {
        int sum = 0;
        for (int i=0;i<3;i++){
            sum+=history[handvalue][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if(win){
            history[prevHandValue][currentHandValue]++;
        }else{
            history[prevHandValue][(currentHandValue+1)%3]++;
            history[prevHandValue][(currentHandValue+2)%3]++;
        }
    }
}
