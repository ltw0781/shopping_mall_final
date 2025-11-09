package com.shop.shopping.board.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class Board {
    
    private int boardId;        // 게시글 ID
    private String userId;      // 유저 ID
    private String category;  // 카테고리
    private String title;       // 게시글 제목
    private String content;     // 게시글 내용
    private Date createdAt;     // 게시글 등록일자
    private Date updatedAt;     // 게식글 수정일자
    private int viewCount;      // 게시글 조회수

}
