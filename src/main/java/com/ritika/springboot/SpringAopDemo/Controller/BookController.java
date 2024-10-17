package com.ritika.springboot.SpringAopDemo.Controller;

import com.ritika.springboot.SpringAopDemo.Entity.Book;
import com.ritika.springboot.SpringAopDemo.Service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;

 /*  public BookController(BookService bookService){
       this.bookService=bookService;
    }
*/
    @GetMapping("/books")
    public List<Book> showBooksList() {
        return bookService.getAllBooks();
    }

    @GetMapping("/getBookById/{bid}")
    public Book getBookById(@PathVariable Integer bid) {
        return bookService.getBookById(bid);
    }
    @PostMapping("/addbook")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @PutMapping("/updatebook")
    public void saveUpdateBook(@RequestBody Book book) {
        bookService.updateBook(book);
    }

    @DeleteMapping("/deletebook/{bid}")
    public void deleteBook(@PathVariable Integer bid) {
        bookService.deleteBook(bid);
    }

}
