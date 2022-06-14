package com.example.initial_test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController{
   @Autowired
   private Book  bookService;

    @GetMapping("/book")
    public String getBook(){
        return "book";
    }
}
