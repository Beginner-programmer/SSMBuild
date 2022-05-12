package com.wbb.service;

import com.wbb.pojo.Books;

import java.util.List;

/**
 * @Author Wangbaba
 * @Date 2022/5/9 23:24
 * @Version 1.0
 */
public interface BookService {
    //增加书
    int addBooks(Books books);

    //修改书
    int updateBooks(Books books);

    //删除书
    int delBooks(int id);

    //id查询书
    Books findBooks(int id);

    //查询所有书
    List<Books> findAllBooks();

    //模糊查询书
    List<Books> findBybook(String bookname);
}
