package com.orcl.design.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    // Fileまたは、Directoryを詰め込む配列
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry: directory){
            size += entry.getSize(); // Compositeのミソ. File/Directoryに関わらずサイズを足し込む
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this.toString());  
        for (Entry entry: directory){
            entry.printList(prefix+"/"+name);
        }
    }

    // Direcotry の中にFile あるいは Directoryを追加していくメソッド
    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }  
    
}
