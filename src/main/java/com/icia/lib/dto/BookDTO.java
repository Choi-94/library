package com.icia.lib.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookDTO {
    private static int number = 0;

    private Long id = 0L;
    private String bookName;
    private String bookPublisher;
    private String bookAuthor;
    private int bookPrice;

    public BookDTO(){
        this.id = id+number++;
    }

}



