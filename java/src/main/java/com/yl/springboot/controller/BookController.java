package com.yl.springboot.controller;

import com.yl.springboot.bean.Book;
import com.yl.springboot.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BookController {
    @Autowired
    BookMapper bookMapper;

    @RequestMapping("/query")
    public ArrayList<Book> getBook(String bookName){
        return bookMapper.getBookByName(bookName);
    }
}
