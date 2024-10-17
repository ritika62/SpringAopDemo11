package com.ritika.springboot.SpringAopDemo.Dao;

import com.ritika.springboot.SpringAopDemo.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Integer> {

}