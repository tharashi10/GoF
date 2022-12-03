package com.orcl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// [Singleton]
import com.orcl.design.singleton.TicketMaker;

// [Strategy]
// import com.orcl.design.strategy.Hand;
// import com.orcl.design.strategy.Player;
// import com.orcl.design.strategy.ProbStrategy;
// import com.orcl.design.strategy.WinningStrategy;

// [Bridge]
//import com.orcl.design.bridge.Display;
//import com.orcl.design.bridge.CharDisplayImpl;
//import com.orcl.design.bridge.CountDisplay;
//import com.orcl.design.bridge.Display;
//import com.orcl.design.bridge.FileDisplayImpl;
//import com.orcl.design.bridge.IncreaseDisplay;
//import com.orcl.design.bridge.RandomDisplay;
//import com.orcl.design.bridge.StringDisplayImpl;

// [Builder]
import com.orcl.design.builder.Director;
import com.orcl.design.builder.TextBuilder;
import com.orcl.design.builder.XMLBuilder;

// [DAO]
import com.orcl.design.dao.Instructor;
import com.orcl.design.dao.InstructorDao;
import com.orcl.design.dao.InstructorDaoImpl;

// [Factory]
//import com.orcl.design.factory.framework.Factory;
//import com.orcl.design.factory.framework.Product;
//import com.orcl.design.factory.idcard.IDCardFactory;

// [Iterator]
import com.orcl.design.iterator.Book;
import com.orcl.design.iterator.BookShelf;

// [Prototype]
//import com.orcl.design.prototype.Manager;
//import com.orcl.design.prototype.MessageBox;
//import com.orcl.design.prototype.Product;
//import com.orcl.design.prototype.UnderlinePen;

// [Adaptor]
//import com.orcl.design.adaptor.Prints;
//import com.orcl.design.adaptor.PrintBanner;
//import com.orcl.design.adaptor.Print;
//import com.orcl.design.adaptor.PrintHuman;

// [Abstract Factory]
//import com.orcl.design.abstractFactory.listfactory.ListFactory;
//import com.orcl.design.abstractFactory.factory.*;

// [Template]
//import com.orcl.design.template.AbstractDisplay;
//import com.orcl.design.template.CharDisplay;
//import com.orcl.design.template.StringDisplay;

// [Composite]
//import com.orcl.design.composite.Directory;
//import com.orcl.design.composite.File;

// [Decorator]
import com.orcl.design.decorator.Display;
import com.orcl.design.decorator.FullBorder;
import com.orcl.design.decorator.UpBorder;
import com.orcl.design.decorator.StringDisplay;

/**
 * design Classで定義した各々のClassを実行するためのMain部分
 */
public class Application 
{
    public static void main( String[] args )
    {  
        /* Iterator Pattern*/
        System.out.println("===== Iterator =====");
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("Around the World in 80 days."));
        bookShelf.appendBook(new Book("Bible."));
        bookShelf.appendBook(new Book("Cinderella."));
        Iterator<Book> ite = bookShelf.iterator();
        while(ite.hasNext()){
            Book book = ite.next();
            System.out.println(book.getName());
        }

        /* Adaptor Pattern */
        //System.out.println("===== Adaptor =====");
        //Prints p = new PrintBanner("HogeHoge");
        //p.printWeak();
        //p.printStrong();
        //Print p = new PrintHuman("Hoge", 50);
        //p.printName();
        //p.printAge();

        /* Singleton Pattern*/
        System.out.println("===== Singleton =====");
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

        /* Template pattern*/
        // System.out.println("===== Template =====");
        // AbstractDisplay cd = new CharDisplay('H');
        // AbstractDisplay sd = new StringDisplay("Hello world!");
        // cd.display();
        // sd.display();

        /* Factory Pattern*/
        //System.out.println("===== Factory =====");
        //Factory idcard = new IDCardFactory();
        //Product card1 = idcard.create("HogeHoge");
        //Product card2 = idcard.create("BarBar");
        //card1.use();
        //card2.use();

        /* ProtoType pattern*/
        //System.out.println("===== Prototype =====");
        //Manager mgr = new Manager();
        //UnderlinePen ulp = new UnderlinePen('-');
        //MessageBox mBox = new MessageBox('*');
        //MessageBox sBox = new MessageBox('/');

        //mgr.register("Strong Message", ulp);
        //mgr.register("Warning", mBox);
        //mgr.register("Slashing", sBox);
        //
        //Product p1 = mgr.create("Strong Message");
        //p1.user("Hello! from p1");
        //Product p2 = mgr.create("Warning");
        //p2.user("Hello! from p2");
        //Product p3 = mgr.create("Slashing");
        //p3.user("Hello! from p3");

        /* DAO */
        System.out.println("\n===== Dao =====");
        InstructorDao instructorDao = new InstructorDaoImpl();
        /* PrintAllInstructor */
        for (Instructor instructor :instructorDao.getAllInstructors()){
            System.out.println(
                "Instructor: [ID=" + instructor.getId() + ", Name=" + instructor.getName() +"]");
        }


        /* Builder Pattern*/
        System.out.println("\n===== Builder =====");
        if (args.length !=1){
            usage();
            //System.exit(0);
        }
        if (args[0].equals("text")){
            TextBuilder tb = new TextBuilder();
            Director director = new Director(tb);
            director.construct();
            String result = tb.getTextResult();
            System.out.println(result); 
        }
        else if (args[0].equals("html")){
            XMLBuilder hb = new XMLBuilder();
            Director director = new Director(hb);
            director.construct();
            String filename = hb.getHTMLResult();
            System.out.println("FileName:"+filename+" was Created."); 
        }
        else {
            usage();
            //System.exit(0);
        }
        
        /* Abstract Factory */
        /* java Main list.html com.orcl.design.listfactory.ListFactory */ 
        //String filename = args[0];
        //String classname = args[1];
        /** 
        System.out.println("filename: "+ filename + " , className: " +classname);

        Factory factory = Factory.getFactory(classname);

        Link blog1 = factory.createLink("Blog_1", "https://sample.com/b1");
        Link blog2 = factory.createLink("Blog_2", "https://sample.com/b2");
        Link blog3 = factory.createLink("Blog_3", "https://sample.com/b3");

        Tray blogTray = factory.createTray("Blog Sites");
        blogTray.add(blog1);
        blogTray.add(blog2);
        blogTray.add(blog3);

        Link news1 = factory.createLink("News_1", "https://sample.com/n1");
        Link news2 = factory.createLink("News_2", "https://sample.com/n2");
        Link news3 = factory.createLink("News_3", "https://sample.com/n3");
        
        Tray newsTray = factory.createTray("News Sites");
        newsTray.add(news1);
        newsTray.add(news2);
        newsTray.add(news3);

        Page page = factory.createPage("Blog and News", "Larry Elison");
        page.add(blogTray);
        page.add(newsTray);
        page.output(filename);
        **/


        /* Bridge Pattern */ 
        /* Display の引数でStringDisplayをnewしているのは、依存性の注入に当たる */
        /*
        Display display1 = new Display(new StringDisplayImpl("Hello1"));
        Display display2 = new CountDisplay(new StringDisplayImpl("Hello2"));
        CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Hello3."));
        display1.display();
        display2.display();
        display3.display();
        display3.multiDisplay(3);

        RandomDisplay display4 = new RandomDisplay(new StringDisplayImpl("Random."));
        display4.randomDisplay(5);

        CountDisplay display5 = new CountDisplay(new FileDisplayImpl("D09-Sample.txt"));
        display5.multiDisplay(3);

        IncreaseDisplay display6 = new IncreaseDisplay(new CharDisplayImpl("<", "*", ">"),2);
        display6.increaseDisplay(6);
        */

        /* Strategy Pattern */
        //int seed1 = Integer.parseInt(args[0]);
        //int seed2 = Integer.parseInt(args[1]);
        //Player player1 = new Player("Taro", new WinningStrategy(seed1));
        //Player player2 = new Player("Hana", new ProbStrategy(seed2));

        //for (int i=0; i<10 ; i++){
        //    Hand nextHand1 = player1.nextHand();
        //    Hand nextHand2 = player2.nextHand();
        //    if (nextHand1.isStrongerThan(nextHand2)){
        //        System.out.println("Winner : " + player1);
        //        player1.win();
        //        player2.lose();
        //    } else if (nextHand2.isStrongerThan(nextHand1)){
        //        System.out.println("Winner : " + player2);
        //        player2.win();
        //        player1.lose();
        //    } else {
        //        System.out.println("Even : No One wins and loses.");
        //        player1.even();
        //        player2.even();
        //    }
        //    System.out.println("Total Result:");
        //    System.out.println(player1);
        //    System.out.println(player2);
        //}
        
        /* Composite Pattern */
        //System.out.println("\n===== Composite =====");
        //Directory rootDir = new Directory("root");
        //Directory binDir = new Directory("bin");
        //Directory tmpDir = new Directory("tmp");
        //Directory usrDir = new Directory("usr");
        //rootDir.add(binDir);
        //rootDir.add(tmpDir);
        //rootDir.add(usrDir);
        //binDir.add(new File("vi", 1000));
        //binDir.add(new File("latex", 2000));
        //rootDir.printList();
        //System.out.println();

        //Directory yuki = new Directory("yuki");
        //Directory hanako = new Directory("hanako");
        //usrDir.add(hanako);
        //usrDir.add(yuki);
        //yuki.add(new File("sample.txt",100));
        //hanako.add(new File("test.txt",200));
        //rootDir.printList();

        // Decorator パターン
        System.out.println("===== Decorator Pattern =====");
        Display d1 = new StringDisplay("Hello World");
        Display d2 = new UpBorder(d1,'#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
    }

    private static void usage() {
        System.out.println("Java Main text");
        System.out.println("Java Main html");
    }
}
