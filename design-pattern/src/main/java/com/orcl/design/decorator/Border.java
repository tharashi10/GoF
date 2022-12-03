package com.orcl.design.decorator;

// 飾り枠を表すクラス
public abstract class Border extends Display{
    protected Display display; // この飾り枠が包んでいる中身
    protected Border(Display display){
        this.display = display;
    }
}
