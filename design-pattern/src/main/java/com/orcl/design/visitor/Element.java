package com.orcl.design.visitor;
public interface Element {
    public abstract void accept(Visitor v);
}
