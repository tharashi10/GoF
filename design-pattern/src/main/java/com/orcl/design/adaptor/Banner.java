package com.orcl.design.adaptor;

/*
 * Banner Class(既存クラス)
 * 役割: 被 Adapter
 */
public class Banner {
    private String str;
    public Banner(String str){
        this.str = str;
    }
    public void showWithParen(){
        System.out.println("[" + str + "]");
    }
    public void showWithAster(){
        System.out.println("*"+ str + "*");
    }
}
