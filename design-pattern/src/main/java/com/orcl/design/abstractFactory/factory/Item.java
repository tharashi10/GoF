package com.orcl.design.abstractFactory.factory;

// HTMLを文字列として返却する抽象クラス
public abstract class Item {
    protected String caption;
    public Item(String caption){
        this.caption = caption;
    }
    public abstract String makeHTML();
}
