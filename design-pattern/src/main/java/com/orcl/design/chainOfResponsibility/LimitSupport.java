package com.orcl.design.chainOfResponsibility;

// 指定したトラブル番号未満のものを解決する
public class LimitSupport extends Support{
    private int limit;

    public LimitSupport(String name,int limit){
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit){
            return true;
        }
        else{
            return false;
        }
    }
    
}
