package com.board.service;

import java.util.ArrayList;

import com.board.model.Board;

public interface BoardService {
	// 게시글 작성
	void writePost(Board board);
	// 전체 게시글 목록
	ArrayList<Board> getPostList();
	// 게시글 상세 조회
	Board getPost(Long boardId);
}
