package com.orcl.design.factory.idcard;

import com.orcl.design.factory.framework.Product;

/*
 * 製品クラスのサブクラスとして定義
 */
public class IDCard extends Product{
    private String owner;
    IDCard(String owner){
        System.out.println(owner + "のID Cardを作ります");
        this.owner = owner;
    }

    @Override
    public void use(){
        System.out.println(this + "のID Cardを使います");
    }
    @Override
    public String toString(){
        return "[IDCard: "+ owner + "]";
    }
    public String getOwner() {
        return owner;
    }
}
