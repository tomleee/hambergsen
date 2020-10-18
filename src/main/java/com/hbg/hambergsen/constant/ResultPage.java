package com.hbg.hambergsen.constant;

import com.github.pagehelper.Page;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ResultPage<T> implements Serializable {

    // 当前页
    private int pageNum;

    // 每页数量
    private int pageSize;

    //总记录数
    private long total;

    //总页数
    private int pages;

    //当前页的数量
    private int size;

    //结果集
    private List<T> list;

    public ResultPage(List<T> list){
        if (list instanceof Page){
            Page<T> page = (Page<T>) list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.total = page.getTotal();
            this.pages = page.getPages();
            this.list = page;
            this.size = page.size();
        }
    }
}
