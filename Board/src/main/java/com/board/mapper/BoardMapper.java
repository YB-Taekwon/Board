package com.board.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.board.model.Board;

public interface BoardMapper {
	// 게시글 작성
	void insertBoard(Board board);
	// 전체 게시글 목록
	ArrayList<Board> selectBoardList();
	// 게시글 상세 조회
	Board selectBoard(Long boardId);
	// 게시글 수정
	void updateBoard(Board board);
	// 게시글 삭제
	void deleteBoard(Long boardId);
}
