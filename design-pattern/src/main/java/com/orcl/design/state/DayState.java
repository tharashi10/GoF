package com.orcl.design.state;

public class DayState implements State {
    private static DayState singleton = new DayState();
    private DayState(){}
    public static State getInstance(){
        return singleton;
    }
    @Override
    public void doClock(Context context,int hour){
        if (hour < 9|| 17 <= hour){
            context.changeState(NightState.getInstance());
        }else if (12 <=hour && hour<=13){
            context.changeState(LunchState.getInstance());
        }
    }
    @Override
    public void doUse(Context context){
        context.recordLog("Using money on Lunch_time");
    }
    @Override
    public void doAlarm(Context context){
        context.callSecurityCenter("Bell on Lunch_time");
        context.changeState(UrgentState.getInstance());
    }
    @Override
    public void doPhone(Context context){
        context.callSecurityCenter("Phoning on Lunch_time");
    }
    @Override
    public String toString(){
        return "On Lunch";
    }
}
