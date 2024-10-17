package com.ritika.springboot.SpringAopDemo.Service;

import com.ritika.springboot.SpringAopDemo.Entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    public List<Book> getAllBooks();
    public Book getBookById(Integer bid);
    public void addBook(Book book);
    public void updateBook(Book book);
    public void deleteBook(Integer bid);
}
