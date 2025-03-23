package com.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.mapper.BoardMapper;
import com.board.model.Board;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper boardMapper;
	
	// 게시글 작성
	@Override
	public void writePost(Board board) {
		boardMapper.insertBoard(board);
	}

	// 전체 게시글 목록
	@Override
	public ArrayList<Board> getPostList() {
		return boardMapper.selectBoardList();
	}

	// 게시글 상세 조회
	@Override
	public Board getPost(Long boardId) {
		return boardMapper.selectBoard(boardId);
	}
	
	

}
