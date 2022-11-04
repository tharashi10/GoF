package com.orcl.design.abstractFactory.factory;

// 抽象的な部品と製品を作る抽象的な工場
public abstract class Factory {
    // クラス名を指定して、具体的な工場のインスタンスを作成するメソッド
    public static Factory getFactory(String classname){
        Factory factory = null;
        try{
            // クラスを動的に読み込む
            // このような処理を「リフレクション」という
            factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
        }catch(ClassNotFoundException e){
            System.out.println("クラス: "+ classname + " がないです");
        }catch(Exception e){
            e.printStackTrace();
        }
        return factory;
    };
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
