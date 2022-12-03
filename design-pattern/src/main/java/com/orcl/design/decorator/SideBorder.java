package com.orcl.design.decorator;

// 左右にだけ飾り枠をつけるクラス
public class SideBorder extends Border {
    private char borderChar;
    public SideBorder(Display display,char ch){
        super(display);
        this.borderChar = ch;
    }
    
    @Override
    public int getColums() {
        return 1+display.getColums()+1; // 飾り枠が包んでいる[中身]の文字数
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        // 指定行の内容は、中身の指定行の両側に飾り文字をつけたもの
        return borderChar + display.getRowText(row) + borderChar;
    }
    
}
