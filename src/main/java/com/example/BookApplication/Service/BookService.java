package com.example.BookApplication.Service;


import com.example.BookApplication.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookApplication.Entity.Book;

@Service
public class BookService {
     @Autowired
     BookRepository bookRepository;

     public Book addBook(Book book) {
         return bookRepository.save(book);
     }

     public Book getBookName(String name) {
            return bookRepository.findBookByName(name);
     }

     public Book updateBook(Book book) {
          return bookRepository.save(book);
     }

     public void deleteBook(Integer id) {
         bookRepository.deleteById(id);
     }
}
