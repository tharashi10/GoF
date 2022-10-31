package com.orcl.design.adaptor;

public class PrintBanner extends Banner implements Prints  {
    public PrintBanner(String str){
        //親クラスのコンストラクタを呼び出す
        super(str);
    }
    //このOverrideは、printWeakやprintStrongがこのClassで勝手に作られたメソッドではなくて、
    //Prints Interfaceで宣言したMethodをOverrideしたものであることを示す
    @Override
    public void printWeak(){
        showWithParen();
    }
    @Override
    public void printStrong(){
        showWithAster();
    }
}
