package com.orcl.design.mediator;
import java.awt.*;
import java.awt.event.*;


/*
 * テキスト入力をするクラス
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {

    private Mediator mediator;
    public ColleagueTextField(String text, int columns){
        super(text,columns);
    }
    
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged(); 
    }
}
