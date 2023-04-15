package com.example.bookstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MyBookListService {

    @Autowired
    private MyBookRepository mr;

    public void saveMyBooks(MyBookList book){
        mr.save(book);
    }

    public List<MyBookList> getAllBook(){
        return mr.findAll();
    }
    
}
