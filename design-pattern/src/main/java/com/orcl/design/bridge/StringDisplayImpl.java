package com.orcl.design.bridge;

// 文字列を表示するクラス
public class StringDisplayImpl extends DisplayImpl{
    private String string;
    private int width;
    public StringDisplayImpl(String string){
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void rawOpen() {
        // TODO Auto-generated method stub
        printLine();
    }

    private void printLine() {
        System.out.println("*");
        for (int i=0; i<width; i++){
            System.out.println("-");
        }
        System.out.println("*");
    }

    @Override
    public void rawPrint() {
        // TODO Auto-generated method stub
        System.out.println("[" + string + "]");
    }

    @Override
    public void rawClose() {
        // TODO Auto-generated method stub
        printLine();
    }
    
}
