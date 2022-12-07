package com.orcl.design.decorator;

// 左右にだけ飾り枠をつけるクラス
public class UpBorder extends Border {
    private char borderChar;
    public UpBorder(Display display,char ch){
        super(display);
        this.borderChar = ch;
    }
    
    @Override
    public int getColums() {
        return display.getColums(); // 飾り枠が包んでいる[中身]の文字数
    }

    @Override
    public int getRows() {
        return display.getRows()+2; //上下に飾り文字つける
    }

    @Override
    public String getRowText(int row) {
        if (row==0 || row==getRows()-1){
            return makeLine(borderChar, getColums());
        }
        else
        return display.getRowText(row-1);
    }

    private String makeLine(char ch, int count){
        StringBuilder line = new StringBuilder();
        for (int i=0; i<count ; i++){
            line.append(ch);
        }
        return line.toString();
    }
    
}
