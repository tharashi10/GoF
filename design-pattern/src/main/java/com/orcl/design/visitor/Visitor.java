package com.orcl.design.visitor;
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
