package com.orcl.design.mediator;
import java.awt.*;

/*
 * ボタンを表すクラス
 */
public class ColleagueBotton extends Button implements Colleague{
    private Mediator mediator;
    public ColleagueBotton(String caption){
        super(caption);
    }

    // (Mediatorを設定していなかった)
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
        System.out.println(this.mediator);
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled); // Trueならボタンを押せる
    }
}
