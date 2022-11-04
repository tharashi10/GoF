package com.orcl.design.abstractFactory.divfactory;

import com.orcl.design.abstractFactory.factory.Factory;
import com.orcl.design.abstractFactory.factory.Link;
import com.orcl.design.abstractFactory.factory.Page;
import com.orcl.design.abstractFactory.factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}
