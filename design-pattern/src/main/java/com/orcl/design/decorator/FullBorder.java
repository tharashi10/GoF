package com.orcl.design.decorator;

// 上下左右に飾り文字をつけるクラス
public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColums() {
        return 1+display.getColums()+1;
    }

    @Override
    public int getRows() {
        return 1+display.getRows()+1;
    }

    @Override
    public String getRowText(int row) {
        if(row==0){
            return "+" + makeLine('-', display.getColums()) + "+";
        }
        else if(row==display.getRows()+1){
            return "+" + makeLine('-', display.getColums()) + "+";
        }
        else{
            return "|" + display.getRowText(row-1) + "|";
        }
    }

    // 文字Chを、count個連続させた文字を作る
    private String makeLine(char ch, int count){
        StringBuilder line = new StringBuilder();
        for (int i=0; i<count ; i++){
            line.append(ch);
        }
        return line.toString();
    }
    
}
