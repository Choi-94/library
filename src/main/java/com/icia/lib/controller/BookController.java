package com.icia.lib.controller;

import com.icia.lib.dto.BookDTO;
import com.icia.lib.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class BookController {
    @PostMapping("/save-param")
    public String savemethod(@ModelAttribute BookDTO bookDTO, Model model){

        int saveResult = bookService.savemethod(bookDTO);
        model.addAttribute("result",saveResult);
        return "saveResult";
    }
    @Autowired
    private BookService bookService;
    @GetMapping("/list")
    public String findAll(Model model){
        List<BookDTO> bookDTOList = bookService.findAll();
        for(BookDTO bookDTO : bookDTOList){

            System.out.println("bookDTO = " + bookDTO);
        }
        model.addAttribute("m1",bookDTOList);
        return "list";
    }
    @GetMapping("/detail")
    public String detail(@RequestParam("id") int id, Model model){

       model.addAttribute("m2",bookService.selectOne(id));
        return "detail";

    }
}
