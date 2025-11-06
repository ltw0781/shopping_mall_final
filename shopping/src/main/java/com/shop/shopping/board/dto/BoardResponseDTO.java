package com.shop.shopping.board.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardResponseDTO {

    private int boardId;
    private String category;
    private String title;
    private String writer;
    private Date regDate;
    private int viewCount;

}
