package com.orcl.design.builder;

public class Director {
    private Builder builder;

    // このコンストラクタにはBuilderのサブクラスが入っていく
    public Director(Builder builder){
        this.builder = builder;
    }

    // 文書を作るメソッド
    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("一般的な挨拶");
        builder.makeItems(new String[]{"Hi","Hello","How are you?"});
        builder.makeString("時間帯に応じた挨拶");
        builder.makeItems(new String[]{
            "Good Afternoon",
            "Good Morning",
            "Good Night"});
        builder.close();
    }
}
