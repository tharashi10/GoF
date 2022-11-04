package com.orcl.design.abstractFactory.listfactory;

import com.orcl.design.abstractFactory.factory.Link;

public class ListLink extends Link{
    //[問題8.3]親クラスのコンストラクタは、引数ありのものが定義されているため
    //暗黙的にSuper()されない。
    public ListLink(String caption, String url){
        super(caption,url);
    }

    @Override
    public String makeHTML(){
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
