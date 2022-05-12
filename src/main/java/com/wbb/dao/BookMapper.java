package com.wbb.dao;

import com.wbb.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Wangbaba
 * @Date 2022/5/8 23:47
 * @Version 1.0
 */
public interface BookMapper {

    //增加书
    int addBooks(Books books);

    //修改书
    int updateBooks(Books books);

    //删除书
    int delBooks(@Param("bookid") int id);

    //id查询书
    Books findBooks(@Param("bookid") int id);

    //查询所有书
    List<Books> findAllBooks();

    //模糊查询书
    List<Books> findBybook(@Param("bookname") String bookname);
}
