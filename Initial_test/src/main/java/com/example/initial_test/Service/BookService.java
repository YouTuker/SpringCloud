package com.example.initial_test.Service;

import com.example.initial_test.Controller.Book;
import org.springframework.stereotype.Service;

@Service
public class BookService implements Book {

    @Override
    public void getBook(){
        System.out.println("得到一本书");
    }

}
