package com.orcl.design.mediator;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.*;

/*
 * ラジオボタンとして使うクラス
 */
public class ColleagueCheckbox extends Checkbox implements ItemListener,Colleague {
    private Mediator mediator;
    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state){
        super(caption,group,state);
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged(); // 状態が変わったらMediatorに通知する
    }
}
