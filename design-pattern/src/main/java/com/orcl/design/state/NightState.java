package com.orcl.design.state;

public class NightState implements State{
    private static NightState singleton = new NightState();
    private NightState(){};
    public static State getInstance(){
        return singleton;
    }
    @Override
    public void doClock(Context context, int hour) {
        if (9<=hour && hour < 17){
            context.changeState(DayState.getInstance());
        }
    }
    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("Emergency: Money");
    }
    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Emergency: Bell");
    }
    @Override
    public void doPhone(Context context) {
        context.recordLog("Phoning on Night");
    }
    @Override
    public String toString(){
        return "Night";
    }
}
