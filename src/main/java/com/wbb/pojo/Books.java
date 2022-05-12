package com.wbb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Wangbaba
 * @Date 2022/5/8 23:39
 * @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookid;//id
    private String bookname;//书名
    private int bookcounts;//数量
    private String detail;//描述

    @Override
    public String toString() {
        return "Books{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", bookcounts=" + bookcounts +
                ", detail='" + detail + '\'' +
                '}';
    }
}
