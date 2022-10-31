package com.orcl.design.prototype;

import java.util.HashMap;
import java.util.Map;

/*
 * Product Interfaceを使ってインスタンスの複製を行うクラス
 */
public class Manager {
    private Map<String,Product> showcase = new HashMap<>();
    public void register(String name, Product p){
        showcase.put(name, p);
    }
    
    public Product create(String protoTypeName){
        Product p = showcase.get(protoTypeName);
        return p.createCopy();
    }
}
