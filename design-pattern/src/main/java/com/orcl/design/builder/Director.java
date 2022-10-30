package com.orcl.design.builder;

public class Director {
    private Builder builder;

    // このコンストラクタにはBuilderのサブクラスが入っていく
    public Director(Builder builder){
        this.builder = builder;
    }

    // 文書を作るメソッド
    public void construct(){
        builder.makeTitle("greeting");
        builder.makeString("一般的なあいさつ");
        builder.makeItems(new String[]{"Hi","Hello","How are ya?"});
        builder.makeString("時間帯に応じたあいさつ");
        builder.makeItems(new String[]{
            "Good Afternoon",
            "Good Morning",
            "Good Night"});
        builder.close();
    }
}
