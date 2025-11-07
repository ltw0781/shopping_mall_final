package com.shop.shopping.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.shopping.board.domain.Board;
import com.shop.shopping.board.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/boards")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public void list(Model model) throws Exception {

        List<Board> boardList = boardService.list();

        model.addAttribute("boardList", boardList);

    }

    @GetMapping("/read")
    public String read(@RequestParam("boardId") int boardId, Model model) throws Exception{

        Board board = boardService.read(boardId);
        model.addAttribute("board", board);

        return "/boards/read";

    }
    
    @GetMapping("/update")
    public String update(@RequestParam("boardId") int boardId, Model model) throws Exception {

        Board board = boardService.read(boardId);

        model.addAttribute("board", board);

        return "/boards/update";

    }

    @PostMapping("update")
    public String updatePro(Board board) throws Exception {

        int result = boardService.update(board);

        if ( result > 0 ) {
            return "redirect:/boards/list";
        }
        int boardId = board.getBoardId();
        return "redirect:/boards/update?boardId=" + boardId + "&error";

    }
    
}
