package com.orcl.design.abstractFactory.factory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

// HTMLの全体を模した抽象クラス
// [問題8.4] Trayのサブクラスにしない理由:
// Tray内でadd(page)できるようになってしまうから。
// pageはItemとはなり得ず、まとめたらあかん。<!DOCTYPE html>...</html>なので
public abstract class Page{
    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();
    
    public Page(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        content.add(item);
    }

    // 自分自身のHTML内容をファイルに書き出す
    public void output(String filename){
        try{
            Files.writeString(
                Path.of(filename), 
                makeHTML(),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE
            );
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public abstract String makeHTML();
}
