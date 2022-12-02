package com.orcl.design.composite;

/**
 * ファイルを表現するクラス
 */

public class File extends Entry{
    private int size;
    private String name;
    public File(String name,int size){
        this.name = name;
        this.size = size;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public int getSize(){
        return size;
    }
    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this.toString());
    }
}
