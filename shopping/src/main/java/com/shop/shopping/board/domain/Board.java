package com.shop.shopping.board.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class Board {
    
    private int boardId;
    private String category;
    private String title;
    private String writer;
    private String content;
    private Date regDate;
    private int viewCount;

}
