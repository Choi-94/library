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

        bookDTOList.add(bookDTO);
        int saveResult = bookService.savemethod(bookDTO);
        if(saveResult >0){
            System.out.println("등록성공");
            return "index";
        }else{
            System.out.println("등록실패");
            return "index";
        }

    }
    @Autowired
    private BookService bookService;
}
