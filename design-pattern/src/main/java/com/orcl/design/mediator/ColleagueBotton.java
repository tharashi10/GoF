package com.orcl.design.mediator;
import java.awt.*;

/*
 * ボタンを表すクラス
 */
public class ColleagueBotton extends Button implements Colleague{
    public ColleagueBotton(String caption){
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        System.out.println(mediator);
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled); // Trueならボタンを押せる
    }
}
