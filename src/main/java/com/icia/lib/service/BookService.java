package com.icia.lib.service;

import com.icia.lib.dto.BookDTO;
import org.springframework.stereotype.Service;

@Service

public class BookService {
    public String savemethod(BookDTO bookDTO){
        System.out.println("bookDTO = " + bookDTO);
        return "index";
    }
}
