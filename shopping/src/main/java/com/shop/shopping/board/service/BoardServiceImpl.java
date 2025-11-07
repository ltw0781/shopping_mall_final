package com.shop.shopping.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.shopping.board.domain.Board;
import com.shop.shopping.board.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardMapper boardMapper;

    /**
     * 게시판 리스트(목록)
     */
    @Override
    public List<Board> list() throws Exception {

        List<Board> boardList = boardMapper.list();

        return boardList;

    }

    @Override
    public Board read(int boardId) throws Exception {
        Board board = boardMapper.read(boardId);
        return board;
    }

    @Override
    public int insert(Board board) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'boardInsert'");
    }

    @Override
    public int update(Board board) throws Exception {
        int result = boardMapper.update(board);
        return result;
    }

    @Override
    public int delete(int boardId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'boardDelete'");
    }

    
}
