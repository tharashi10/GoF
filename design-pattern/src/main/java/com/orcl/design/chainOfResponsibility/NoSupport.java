package com.orcl.design.chainOfResponsibility;

// 解決処理を何もしないクラス
public class NoSupport extends Support{

    public NoSupport(String name){super(name);};
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
