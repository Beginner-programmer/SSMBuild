package com.wbb.controller;

import com.wbb.pojo.Books;
import com.wbb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author Wangbaba
 * @Date 2022/5/10 16:49
 * @Version 1.0
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //所有书籍
    @RequestMapping("/Allbook")
    public String list(Model model) {
        List<Books> booksList = bookService.findAllBooks();
        model.addAttribute("list", booksList);
        return "Allbook";
    }

    //模糊查询书籍
    @RequestMapping("/findBybook")
    public String findBybook(Model model,String bookname){
       List<Books> books= bookService.findBybook(bookname);
        System.out.println(books);
        model.addAttribute("list",books);
        return "Allbook";
    }
    //跳转到新增页面
   @RequestMapping("/toAddbook")
    public String toAddbook(){
        return "Addbook";
    }

    //新增书籍
    @RequestMapping("/Addbook")
    public String Addbook(Books books){
        System.out.println(books);
        bookService.addBooks(books);
        return "redirect:/book/Allbook";//重定向请求
    }

    //跳转到修改页面
    @RequestMapping("/toUpdatebook")
    public String toUpdateBook( Model model,int id) {
        Books books = bookService.findBooks(id);
        System.out.println(books);
        model.addAttribute("book",books );
        return "Updatebook";
    }

    //修改书籍
    @RequestMapping("/Updatebook")
    public String updateBook(Model model, Books book) {
        System.out.println(book);
        bookService.updateBooks(book);
        Books books = bookService.findBooks(book.getBookid());
        model.addAttribute("books", books);
        return "redirect:/book/Allbook";
    }

    //删除书籍
    @RequestMapping("/Delbook/{bookid}")
    public String Delbook(@PathVariable("bookid") int id){
        bookService.delBooks(id);
        return "redirect:/book/Allbook";
    }
}
