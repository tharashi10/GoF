package com.orcl.design.strategy;

//ジャンケンの手を表すクラス

// ぐ・ち・ぱの勝利判定
// this:ぐ(0)の時、value=0
// (this.value+1)%3==hand.valueの部分について、
// this.value+1=1 
// hand.value=1(チョキ)ならthisが勝つ.

public enum Hand {
    ROCK("グー",0),
    SCISSORS("チョキ",1),
    PAPER("パー",2);
    private String name;
    private int value;

    private static Hand[] hands = {ROCK,SCISSORS,PAPER};
    
    private Hand(String name, int value){
        this.name= name;
        this.value = value;
    }
    
    public static Hand getHand(int value){
        return hands[value];
    }

    public boolean isStrongerThan(Hand hand){
        return fight(hand)==1;
    }

    public boolean isWeakerThan(Hand hand){
        return fight(hand)==-1;
    }

    private int fight(Hand hand) {
        if (this==hand){
            return 0; //引き分けの場合
        } else if ((this.value+1)%3==hand.value){
            return 1; //Winの場合
        } else{
            return -1; //Loseの場合
        }
    }

    @Override
    public String toString(){
        return name;
    }
}
