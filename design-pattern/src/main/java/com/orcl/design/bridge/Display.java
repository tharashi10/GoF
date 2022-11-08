package com.orcl.design.bridge;

// 機能のクラス階層 = 抽象的なイメージで「何かを表示するもの」
public class Display {
    private DisplayImpl impl;
    public Display(DisplayImpl impl){
        this.impl = impl;
    }
    public void open(){
        impl.rawOpen();
    };
    public void print(){
        impl.rawPrint();
    };
    public void close(){
        impl.rawClose();
    };
    public final void display(){
        open();
        print();
        close();
    };
}
