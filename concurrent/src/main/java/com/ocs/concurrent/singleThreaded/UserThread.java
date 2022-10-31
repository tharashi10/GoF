package com.ocs.concurrent.singleThreaded;

public class UserThread extends Thread{
    private final Gate gate;
    private final String name;
    private final String address;
    public UserThread(Gate gate, String name, String address){
        this.gate = gate;
        this.name = name;
        this.address = address;
    }
    public void run(){
        System.out.println(name + " THREAD_BEGIN");
        while (true){
            gate.pass(name, address);
        }
    }
}
