package com.orcl.design.prototype;

public interface Product extends Cloneable{
    public abstract void user(String s);
    public abstract Product createCopy();
}
