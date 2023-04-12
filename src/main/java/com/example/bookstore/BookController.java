package com.example.bookstore;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String home() {
        return "home";
    }
    
    @GetMapping("/book_register")
    public String bookRegister(){
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public ModelAndView getAllBook(){
        List<Book> list = bookService.getAllBooks();
        return new ModelAndView("bookList","book",list);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b) {
        bookService.save(b);
        return "redirect:/available_books";
    }  
}
