package com.orcl.design.decorator;

import java.util.ArrayList;
import java.util.List;

// 複数行からなる文字列表示用
public class MultiStringDisplay extends Display {
    public List<String> body = new ArrayList<>();

    private int max_columns = 0; // 表示文字列の最大文字数
    public void add(String msg){
        body.add(msg);
        if (max_columns<msg.length()){
            max_columns = msg.length();
        }
        updatePadding();
    }

    @Override
    public int getColums() {
        return max_columns;
    }

    @Override
    public int getRows() {
        //return 1;
        return body.size();
    }

    @Override
    public String getRowText(int row) {
        return body.get(row);
    }

    //空白文字の追加
    private void updatePadding(){
        for (int row=0;row<body.size();row++){
            String line = body.get(row);
            int padding = max_columns - line.length();
            if (padding>0){
                body.set(row, line + spaces(padding));
            }
        }
    }

    private String spaces(int count){
        StringBuilder spaces = new StringBuilder();
        for (int i=0; i<count ; i++){
            spaces.append(' ');
        }
        return spaces.toString();
    }
}
