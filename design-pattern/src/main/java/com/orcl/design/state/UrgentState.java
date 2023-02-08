package com.orcl.design.state;

public class UrgentState implements State {
    private static UrgentState singleton = new UrgentState();
    private UrgentState(){}
    public static State getInstance(){
        return singleton;
    }
    @Override
    public void doClock(Context context,int hour){

    }
    @Override
    public void doUse(Context context){
        context.recordLog("Using money .. Emergency");
    }
    @Override
    public void doAlarm(Context context){
        context.callSecurityCenter("Bell for Emergency");
    }
    @Override
    public void doPhone(Context context){
        context.callSecurityCenter("Phoning for Emergency");
    }
    @Override
    public String toString(){
        return "Emergency";
    }
}
