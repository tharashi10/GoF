package com.orcl.design.visitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// implements Iterable<Entry>を実装しない場合、以下起こる
// 1) iterable()メソッド Compile Error
// 2) 拡張For文への影響（Iterable Interfaceを実装しているため）

public class Directory extends Entry implements Iterable<Entry> {
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        /*int size = 0;
        for (Entry entry: directory) {
            size += entry.getSize();
        }
        return size;*/
        SizeVisitor v = new SizeVisitor();
        accept(v);
        return v.getSize();
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    public Iterator<Entry> iterator() {
        return directory.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
