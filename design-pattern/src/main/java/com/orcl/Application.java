package com.orcl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import com.orcl.design.adaptor.Print;
//import com.orcl.design.adaptor.PrintHuman;
import com.orcl.design.singleton.TicketMaker;
import com.orcl.design.adaptor.Prints;
import com.orcl.design.adaptor.PrintBanner;

import com.orcl.design.template.AbstractDisplay;
import com.orcl.design.template.CharDisplay;
import com.orcl.design.template.StringDisplay;
/**
 * design Classで定義した各々のClassを実行するためのMain部分
 */
public class Application 
{
    public static void main( String[] args )
    {  
        /* Adaptor Pattern CLient */
        Prints p = new PrintBanner("HogeHoge");
        p.printWeak();
        p.printStrong();
        //Print p = new PrintHuman("Hoge", 50);
        //p.printName();
        //p.printAge();

        /* Singleton */
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

        /* Template */
        AbstractDisplay cd = new CharDisplay('H');
        AbstractDisplay sd = new StringDisplay("Hello world!");
        cd.display();
        sd.display();

        /*
         * <<HHHHH>>
         * ++
         * |Hello world!|
         * |Hello world!|
         * |Hello world!|
         * |Hello world!|
         * |Hello world!|
         * ++
        */
    }
}
