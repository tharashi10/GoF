package com.orcl.design.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book>{
    // BookShelfIteratorがScanする本棚
    private BookShelf bookshelf;
    private int index;
    public BookShelfIterator(BookShelf bookshelf){
        this.bookshelf = bookshelf;
        this.index = 0;
    }
    @Override
    public boolean hasNext(){
        if (index < bookshelf.getLength()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next(){
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        Book book = bookshelf.getBookAt(index);
        index++;
        return book;
    }

}
