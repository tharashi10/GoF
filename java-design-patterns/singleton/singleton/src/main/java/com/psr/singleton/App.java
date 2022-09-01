package com.psr.singleton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Singleton Patternについて
 * [生成するインスタンスの数を1つに制限するデザインパターン]
 */ 
public class App 
{
    public static void main( String[] args )
    {
        TicketMaker instance1 = TicketMaker.getInstance();
        TicketMaker instance2 = TicketMaker.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);

        List<TicketMaker> lst = new ArrayList<TicketMaker>();
        lst.add(TicketMaker.getInstance());
        lst.add(TicketMaker.getInstance());
        lst.add(TicketMaker.getInstance());

        Iterator<TicketMaker> it = lst.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        /*
         * Create Instance.
         * com.psr.singleton.TicketMaker@7ad041f3
         * com.psr.singleton.TicketMaker@7ad041f3
         * com.psr.singleton.TicketMaker@7ad041f3
         * com.psr.singleton.TicketMaker@7ad041f3
         * com.psr.singleton.TicketMaker@7ad041f3
         */
    }
}
