package com.ritika.springboot.SpringAopDemo.Service;

import com.ritika.springboot.SpringAopDemo.Dao.BookDao;
import com.ritika.springboot.SpringAopDemo.Entity.Book;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookDao bookDao;
    /*public BookServiceImpl(BookDao bookDao){
        this.bookDao=bookDao;
    }*/

    @Override
    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }

    @Override
    public Book getBookById(Integer bid) {
        return bookDao.findById(bid).orElseThrow();
    }

    @Override
    public void addBook(Book book) {
        bookDao.save(book);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.saveAndFlush(book);
    }

    @Override
    public void deleteBook(Integer bid) {
        bookDao.deleteById(bid);
    }
}