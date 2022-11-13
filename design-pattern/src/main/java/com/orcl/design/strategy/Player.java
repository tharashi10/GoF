package com.orcl.design.strategy;

// ジャンケンを行う人を表したクラス
public class Player {
    private String name;
    private Strategy strategy;
    private int gamecount;
    private int wincount;
    private int losecount;

    public Player(String name, Strategy strategy){
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void win(){
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    public void lose(){
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    public void even(){
        gamecount++;
    }

    @Override
    public String toString(){
        return "[" 
               + name + ":"
               + gamecount + " games, "
               + wincount + " wins, "
               + losecount + " loses"
               + "]";
    }
}
