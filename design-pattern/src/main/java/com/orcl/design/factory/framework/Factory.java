package com.orcl.design.factory.framework;

/*
 * Create Methodを実装したクラス
 * Factory Patternの核
 * ここでは、
 * Factory＝「Createメソッドで製品インスタンスを作るもの」
 */
public abstract class Factory {
    // Final; Overrideさせないため
    public final Product create(String owner){
        // 作って
        Product p = createProduct(owner);
        // 登録
        registerProduct(p);
        return p;
    }
    public abstract Product createProduct(String owner);
    public abstract void registerProduct(Product p);
}
