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

    @Override
    public List<Board> list() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'list'");
    }

    @Override
    public Board select(int boardId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'select'");
    }

    @Override
    public int insert(Board board) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public int update(Board board) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public int delete(int boardId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
