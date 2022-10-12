package com.ocs.concurrent.singleThreaded;


// スレッドセーフではないGateクラス
// synchronizedを付けることでスレッドセーフにする
// synchronizedを付けることで同時に一つのスレッドからしか、
// 実行されないことを保証する
// 一般的な表現だと、本クラスは「共有資源役」となる
// (複数のスレッドからアクセスされるクラスのこと)
public class Gate {
    private int counter=0;
    private String name = "Somebody";
    private String address = "Somewhere";

    public synchronized void pass(String name, String address){
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }
    public String toString(){
        return "No." + counter + ": " + name + ", " + address;
    }
    public synchronized void check(){
        if (name.charAt(0)!=address.charAt(0)){
            System.out.println("***** BROKEN *****" + toString());
        }
    }
}
