package com.ocs.concurrent;

/*
 * Thread Classを使うパターン
 */
public class PrintThread extends Thread{
    private String message;
    public PrintThread(String message){
        this.message = message;
    }
    public void run(){
        for(int i=0;i<100; i++){
            System.out.print( message );
        }
    }
}
