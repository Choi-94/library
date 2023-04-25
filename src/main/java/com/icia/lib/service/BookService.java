package com.icia.lib.service;

import com.icia.lib.dto.BookDTO;
import com.icia.lib.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public int savemethod(BookDTO bookDTO){
        System.out.println("bookDTO = " + bookDTO);
        int result = bookRepository.save(bookDTO);
        return 0;
    }
}
