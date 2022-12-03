package com.orcl.design.decorator;

// 1行だけからなる文字列表示用
public class StringDisplay extends Display {
    public String string;
    public StringDisplay(String string){
        this.string = string;
    }

    @Override
    public int getColums() {
        return string.length();
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if(row!=0){
            throw new IndexOutOfBoundsException();
        }
        return string;
    }
}
