package com.orcl.design.bridge;

// 機能: 環境など依存性を気にせず、共通で使えるもの（たぶん）
// 実装: 環境など、仕様上気にする必要が出てくるもの。MacImpl, WinImpl（たぶん）
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
