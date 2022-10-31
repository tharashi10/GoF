package com.orcl.design.factory.idcard;

import com.orcl.design.factory.framework.Factory;
import com.orcl.design.factory.framework.Product;

/*
 * Factoryの実装クラス  
 */
public class IDCardFactory extends Factory {
    @Override
    public Product createProduct(String owner){
        return new IDCard(owner);
    }
    @Override
    public void registerProduct(Product p){
        System.out.println(p + "を登録しました");
    }
}
