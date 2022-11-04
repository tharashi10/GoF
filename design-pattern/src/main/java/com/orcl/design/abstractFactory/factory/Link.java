package com.orcl.design.abstractFactory.factory;

// HTMLのハイパーリンクの抽象クラス
public abstract class Link extends Item{
    protected String url;
    public Link(String caption, String url){
        super(caption); //これ
        this.url = url;
    }
}
