package com.orcl.design.flyweight;

public class BigString {
    // 「大きな文字」の配列
    private BigChar[] bigchars;
    
    // コンストラクタ
    public BigString(String string) {
        //System.out.println(string.length());
        initShared(string);
    }
    public BigString(String string, boolean shared){
        if (shared){
            initShared(string);
        }else{
            unInitShared(string);
        }
    }
    private void initShared(String string){
        BigCharFactory factory = BigCharFactory.getInstance();
        bigchars = new BigChar[string.length()];
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i)); //共有される部分
        }
    }
    private void unInitShared(String string){
        bigchars = new BigChar[string.length()];
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = new BigChar(string.charAt(i));
        }
    }
    // 表示
    public void print() {
        for (BigChar bc: bigchars) {
            bc.print();
        }
    }
}