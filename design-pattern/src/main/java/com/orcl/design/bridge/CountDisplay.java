package com.orcl.design.bridge;

// 指定回数だけ表示するための「機能クラス」
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl) {
        super(impl);
        //TODO Auto-generated constructor stub
    }

    public void multiDisplay(int times){
        open();
        for (int i=0; i<times ; i++){
            print();
        }
        close();
    };
}
