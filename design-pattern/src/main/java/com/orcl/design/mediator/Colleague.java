package com.orcl.design.mediator;

/*
 * メンバのインターフェースを定める
 */
public interface Colleague {
    public abstract void setMediator(Mediator mediator);
    public abstract void setColleagueEnabled(boolean enabled);
}
