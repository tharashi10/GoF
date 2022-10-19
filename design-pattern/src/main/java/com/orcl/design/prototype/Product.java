package com.orcl.design.prototype;

// extends, implements のスイッチのおかげで頭がバグった
public abstract class Product implements Cloneable{
    public abstract void user(String s);
    public abstract Product createCopy();

    /*public Product createCopy(){
        Product p = null;
        try {
            p = (Product) clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }*/
}
