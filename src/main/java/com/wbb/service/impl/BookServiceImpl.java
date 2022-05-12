package com.wbb.service.impl;

import com.wbb.dao.BookMapper;
import com.wbb.pojo.Books;
import com.wbb.service.BookService;

import java.util.List;

/**
 * @Author Wangbaba
 * @Date 2022/5/9 23:26
 * @Version 1.0
 */
public class BookServiceImpl implements BookService {
    //service调dao层，组合dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBooks(Books books) {
        return bookMapper.addBooks(books);
    }

    @Override
    public int updateBooks(Books books) {
        return bookMapper.updateBooks(books);
    }

    @Override
    public int delBooks(int id) {
        return bookMapper.delBooks(id);
    }

    @Override
    public Books findBooks(int id) {
        return bookMapper.findBooks(id);
    }

    @Override
    public List<Books> findAllBooks() {
        return bookMapper.findAllBooks();
    }

    @Override
    public List<Books> findBybook(String bookname) {
        return bookMapper.findBybook(bookname);
    }
}
