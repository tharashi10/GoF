package com.orcl.design.strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {

    
    private Random rand;
    private Boolean won=false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        rand = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        // もっかい同じ手を出す
        if (!won){
            prevHand = Hand.getHand(rand.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
