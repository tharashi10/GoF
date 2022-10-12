package com.ocs.concurrent;

/*
 * Runnable Interfaceを使うパターン
 * Clientで利用する際は、Runnbale Interfaceを実装し、
 * そのインスタンスをThreadのコンストラクタに渡す
 * その後start()メソッドを呼ぶ
 */
public class Printer implements Runnable{
    private String message;
    public Printer(String message){
        this.message = message;
    }
    public void run(){
        for(int i=0;i<100; i++){
            System.out.print( message );
        }
    }
}
