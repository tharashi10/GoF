package com.orcl.design.iterator;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;
    
    // Constructor
    public BookShelf(int maxnum){
        this.books = new Book[maxnum];
    }
    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }
    // BookShelfClassに対応するIterator: BookShelfIterator
    @Override
    public Iterator<Book> iterator(){
        return new BookShelfIterator(this);
    }
}
