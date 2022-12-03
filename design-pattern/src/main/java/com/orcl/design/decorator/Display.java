package com.orcl.design.decorator;

// 文字列表示用のクラス
public abstract class Display {
    public abstract int getColums();
    public abstract int getRows();
    public abstract String getRowText(int row); //row 行目の文字列を受け取る
    
    // Template パターン
    public void show(){
        for(int i=0; i<getRows();i++){
            System.out.println(getRowText(i));
        }
    };
}
