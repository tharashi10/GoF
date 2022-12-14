package com.orcl.design.chainOfResponsibility;

// トラブルを解決する抽象クラス
public abstract class Support {
    private String name;
    private Support next; // たらい回し先

    public Support(String name){
        this.name = name;
        this.next = null;
    }

    public Support setNext(Support next){
        this.next = next;
        return next;
    }

    // トラブルの解決手順
    public void support(Trouble trouble){
        //if (resolve(trouble)){
        //    done(trouble);
        //}
        // 再帰ではなくFor文で
        for (Support obj=this ; true ; obj = obj.next){
            if (obj.resolve(trouble)){
                obj.done(trouble);
                break;
            }
            else if (obj.next==null){
                obj.fail(trouble);
                break;
            }
        }
    }

    @Override
    public String toString(){
        return "[" + name + "]";
    }

    protected abstract boolean resolve(Trouble trouble);

    private void done(Trouble trouble){
        System.out.println(trouble + " was resolved by " + this);
    }

    private void fail(Trouble trouble){
        System.out.println(trouble + " cannot be resolved");
    }

}
