package com.icia.lib.service;

import com.icia.lib.dto.BookDTO;
import com.icia.lib.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service

public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public int savemethod(BookDTO bookDTO) {
        System.out.println("bookDTO = " + bookDTO);
        int result = bookRepository.save(bookDTO);
        return result;
    }

    public List<BookDTO> findAll() {
        List<BookDTO> bookDTOList = bookRepository.findAll();
        if (bookDTOList.size() == 0) {
            return null;
        } else {
            return bookDTOList;
        }
    }

    public BookDTO selectOne(int id) {
        BookDTO bookDTO = bookRepository.selectOne(id);
        return bookDTO;
    }
}
