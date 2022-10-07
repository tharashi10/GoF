package com.orcl.design.factory.idcard;

import com.orcl.design.factory.framework.Product;

/*
 * 製品クラスのサブクラスとして定義
 */
public class IDCard extends Product{
    /*
     * 通し番号もフィールド変数として持たせる場合は、
     * synchronizedのメソッドを用意することになる
     * 通し番号は、インクリメントされていく動き
    */
    private String owner;

    /*
     * 修飾子がない場合は、パッケージ内のみのアクセスOKとなる
     */
    IDCard(String owner){
        System.out.println(owner + "のID Cardを作ります");
        this.owner = owner;
    }

    @Override
    public void use(){
        System.out.println(this + "のID Cardを使います");
    }
    /* 
     * toString Objectのオーバーライド
     * this: Instance自体を指す 
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     */
    @Override
    public String toString(){
        return "[IDCard: "+ owner + "]";
    }
    public String getOwner() {
        return owner;
    }
}
