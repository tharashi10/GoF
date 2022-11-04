package com.orcl.design.abstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

//複数のLinkやTrayをまとめるクラス(まとめる際はadd)
public abstract class Tray extends Item{
    protected List<Item> tray = new ArrayList<>();
    public Tray(String caption){
        super(caption); //これ
    }

    public void add(Item item){
        tray.add(item);
    }
}
