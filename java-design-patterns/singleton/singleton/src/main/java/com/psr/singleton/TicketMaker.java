package com.psr.singleton;

/**
 * Singletonクラス
 * */
public class TicketMaker {
    //自身の型のインスタンスがPrivateなクラス変数とする
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;

    //外部から呼ばれないようにする
    private TicketMaker(){
        System.out.println("Create Instance.");
    }

    /**
     * インスタンスをかえすためのメソッド
     * @return instance of Singleton
     * */
    public static TicketMaker getInstance(){
        return ticketMaker;
    }

    //getter and setter
    public int getNextTicketNumber(){
        return ticket++;
    }
}
