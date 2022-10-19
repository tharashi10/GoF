package com.orcl.design.prototype;

public class UnderlinePen extends Product{
    private char ulchar;
    public UnderlinePen(char ulchar){
        this.ulchar = ulchar;
    }

    @Override
    public void user(String s){
        int ulLength = s.length();
        System.out.print(s);
        System.out.println();
        for (int i=0; i< ulLength; i++){
            System.out.print(ulchar);
        }
        System.out.println();
    }

    public UnderlinePen(UnderlinePen protoType){
        this.ulchar = protoType.ulchar;
    }

    /*
     * clone()メソッドは、java.lang.objectクラスのメソッド
     * 自分自身のインスタンスを複製する
     * 自分自身のインスタンスからしか呼び出すことができないため、
     * 他クラスから複製のリクエストがある場合は、
     * 今回のようにcreateCopy()のように別メソッドで包む必要がある
     */

    @Override
    public Product createCopy(){
        /*Product p = null;
        try {
            p = (Product) clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;*/
        UnderlinePen up = new UnderlinePen(this);
        return up;
    }
}
