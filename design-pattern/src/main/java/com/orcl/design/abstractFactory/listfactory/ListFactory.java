package com.orcl.design.abstractFactory.listfactory;

import com.orcl.design.abstractFactory.factory.Factory;
import com.orcl.design.abstractFactory.factory.Link;
import com.orcl.design.abstractFactory.factory.Page;
import com.orcl.design.abstractFactory.factory.Tray;

// Listfactory Package: 具体的な工場・部品・製品を含むパッケージ
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        // TODO Auto-generated method stub
        return new ListLink(caption,url);
    }
    @Override
    public Tray createTray(String caption) {
        // TODO Auto-generated method stub
        return new ListTray(caption);
    }
    @Override
    public Page createPage(String title, String author) {
        // TODO Auto-generated method stub
        return new ListPage(title,author);
    }
}
