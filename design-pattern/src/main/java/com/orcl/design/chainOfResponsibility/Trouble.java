package com.orcl.design.chainOfResponsibility;

// 発生したトラブルを表す。トラブル番号をもつ
public class Trouble {
    private int number;
    public Trouble(int number){
       this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public String toString(){
        return "[Trouble #" + number + "]";
    }
}
