package com.orcl.design.state;

public class LunchState implements State {
    private static LunchState singleton = new LunchState();
    private LunchState(){}
    public static State getInstance(){
        return singleton;
    }
    @Override
    public void doClock(Context context,int hour){
        if (9 <= hour && hour <12 || 13<=hour && hour<17){
            context.changeState(DayState.getInstance());
        } else if (hour < 9|| 17 <= hour){
            context.changeState(NightState.getInstance());
        }
    }
    @Override
    public void doUse(Context context){
        context.callSecurityCenter("Bell on Lunch");
    }
    @Override
    public void doAlarm(Context context){
        context.callSecurityCenter("Bell on Lunch");
    }
    @Override
    public void doPhone(Context context){
        context.recordLog("Recording on Lunch");
    }
    @Override
    public String toString(){
        return "On Lunch";
    }
}
