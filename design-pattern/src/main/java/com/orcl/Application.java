package com.orcl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import com.orcl.design.adaptor.Print;
//import com.orcl.design.adaptor.PrintHuman;
import com.orcl.design.singleton.TicketMaker;
import com.orcl.design.adaptor.Prints;
import com.orcl.design.dao.Instructor;
import com.orcl.design.dao.InstructorDao;
import com.orcl.design.dao.InstructorDaoImpl;
import com.orcl.design.factory.framework.Factory;
import com.orcl.design.factory.framework.Product;
import com.orcl.design.factory.idcard.IDCardFactory;
import com.orcl.design.iterator.Book;
import com.orcl.design.iterator.BookShelf;
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
        /* Iterator */
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

        /* Adaptor Pattern Client */
        System.out.println("===== Adaptor =====");
        Prints p = new PrintBanner("HogeHoge");
        p.printWeak();
        p.printStrong();
        //Print p = new PrintHuman("Hoge", 50);
        //p.printName();
        //p.printAge();

        /* Singleton */
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

        /* Template */
        System.out.println("===== Template =====");
        AbstractDisplay cd = new CharDisplay('H');
        AbstractDisplay sd = new StringDisplay("Hello world!");
        cd.display();
        sd.display();

        /* Factory */
        System.out.println("===== Factory =====");
        Factory idcard = new IDCardFactory();
        Product card1 = idcard.create("HogeHoge");
        Product card2 = idcard.create("BarBar");
        card1.use();
        card2.use();

        /* DAO */
        System.out.println("===== Dao =====");
        InstructorDao instructorDao = new InstructorDaoImpl();
        /* PrintAllInstructor */
        for (Instructor instructor :instructorDao.getAllInstructors()){
            System.out.println(
                "Instructor: [ID=" + instructor.getId() + ", Name=" + instructor.getName() +"]");
        }
    }
}
