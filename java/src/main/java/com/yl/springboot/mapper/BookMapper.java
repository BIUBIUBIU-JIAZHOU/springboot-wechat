package com.yl.springboot.mapper;

import com.yl.springboot.bean.Book;

import java.util.ArrayList;

public interface BookMapper {
    public ArrayList<Book> getBookByName(String bookName);
}
