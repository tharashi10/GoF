package com.orcl.design.interpreter;

// 構文木の最上位クラス
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
