package com.orcl.design.strategy;

import java.util.Random;

public class RandomStrategy implements Strategy {

    private Random random;
    private Hand hand;
    public RandomStrategy(int seed){random=new Random(seed);}
    @Override
    public Hand nextHand() {
        hand = Hand.getHand(random.nextInt(3));
        return hand;
    }

    @Override
    public void study(boolean win) {
    }
}
