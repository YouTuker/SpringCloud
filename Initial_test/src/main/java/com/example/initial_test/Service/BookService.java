package com.example.initial_test.Service;

import org.springframework.stereotype.Service;

@Service
public class BookService implements Book {

    @Override
    public void getBook(){
        System.out.println("得到一本书");
    }

}
