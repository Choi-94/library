package com.icia.lib.controller;

import com.icia.lib.dto.BookDTO;
import com.icia.lib.service.BookService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



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
    //수정화면출력
    @GetMapping("/update")
    public String updateForm(@RequestParam("id") int id, Model model){
        BookDTO bookDTO = bookService.selectOne(id);
        model.addAttribute("book",bookDTO);
        return "update";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute BookDTO bookDTO){
        bookService.update(bookDTO);
        //수정이 완료되면 상세페이지를 다시 출력
        // redirect 요청: 다른 컨트롤러 메서드의 주소를 요청(jsp 페이지 이름을 리턴하는 것이 아님)
        return "redirect:/detail?id="+bookDTO.getId();
    }
    // 삭제처리
    @GetMapping("/delete")
    public String delete(@RequestParam("id")int id){
        bookService.delete(id);
        //삭제 처리 후 목록 출력
        //redirect를 안쓰면 껍데기만 가져가는거다
        return "redirect:/list";
    }
}
