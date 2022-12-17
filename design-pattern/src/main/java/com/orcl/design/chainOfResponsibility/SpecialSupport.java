package com.orcl.design.chainOfResponsibility;

// 指定したトラブル番号未満のものを解決する
public class SpecialSupport extends Support{
    private int number;

    public SpecialSupport(String name,int number){
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number){
            return true;
        }
        else{
            return false;
        }
    }
    
}
