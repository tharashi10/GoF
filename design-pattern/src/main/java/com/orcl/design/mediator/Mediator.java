package com.orcl.design.mediator;

/*
 * 相談役(Colleagueと通信する)を表現するインターフェース
 */
public interface Mediator {
    public abstract void createColleagues();
    public abstract void colleagueChanged();
}
