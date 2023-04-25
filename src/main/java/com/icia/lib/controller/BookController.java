package com.icia.lib.controller;

import com.icia.lib.dto.BookDTO;
import com.icia.lib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    @PostMapping("/save-param")
    public String savemethod(@ModelAttribute BookDTO bookDTO){
        List<BookDTO> bookDTOList = new ArrayList<>();
        bookService.savemethod(bookDTO);
        bookDTOList.add(bookDTO);
        return "index";
    }
    @Autowired
    private BookService bookService;
}
