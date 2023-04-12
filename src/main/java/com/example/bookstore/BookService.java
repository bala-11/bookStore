package com.example.bookstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepo;

    // save new book
    public void save(Book b){
        bookRepo.save(b);
    }

    // show all books
    public List<Book> getAllBooks(){
        return  bookRepo.findAll();
    }

}
