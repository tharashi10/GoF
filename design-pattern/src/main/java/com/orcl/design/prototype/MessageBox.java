package com.orcl.design.prototype;

public class MessageBox extends Product{
    private char decochar;
    public MessageBox(char decochar){
        this.decochar = decochar;
    }

    @Override
    public void user(String s){
        int decoLength = 1 + s.length() + 1;
        for (int i=0; i< decoLength; i++){
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + s + decochar);
        for (int i=0; i< decoLength; i++){
            System.out.print(decochar);
        }
        System.out.println();
    }

    public MessageBox(MessageBox protoType){
        this.decochar = protoType.decochar;
    }

    /*
     * clone()メソッドは、java.lang.objectクラスのメソッド
     * 自分自身のインスタンスを複製する
     * 自分自身のインスタンスからしか呼び出すことができないため、
     * 他クラスから複製のリクエストがある場合は、
     * 今回のようにcreateCopy()のように別メソッドで包む必要がある
     */
    @Override
    public Product createCopy(){
        /*Product p = null;
        try {
            p = (Product) clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;*/
        MessageBox mb = new MessageBox(this);
        return mb;
    }
}
