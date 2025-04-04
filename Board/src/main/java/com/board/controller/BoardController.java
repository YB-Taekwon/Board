package com.board.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.model.Board;
import com.board.service.BoardService;

@Controller
@RequestMapping("/")
public class BoardController {
	
	@Resource(name = "boardService")
	BoardService boardService;
	
	
	// 전체 게시글 목록
	@GetMapping
	public String getPostList(Model model) {
		ArrayList<Board> posts = boardService.getPostList();
		model.addAttribute("posts", posts);
		
		return "index";
	}
	
	
	// 게시글 상세 조회
	@GetMapping("/post-info")
	public String getPost(Long boardId, Model model) {
		Board post = boardService.getPost(boardId);
		model.addAttribute("post", post);
		
		return "post-info";
	}
	
	
	// 글 작성 화면
	@GetMapping("/write-post")
	public String writePostForm() {
		return "write-post-form";
	}
	
	
	// 글 작성
	@PostMapping("/write-post")
	public String writePost(Board board) {
		boardService.writePost(board);
		return "redirect:/post-list";
	}
	
	
	// 글 수정 화면
	@GetMapping("/modify-post")
	public String modifyPostForm(Long boardId, Model model) {
		Board post = boardService.getPost(boardId);
		model.addAttribute("post", post);
		return "modify-post-form";
	}
	
	
	// 글 수정
	@PostMapping("/modify-post")
	public String modifyPost(Board board) {
		boardService.modifyPost(board);
		return "redirect:/";
	}
	
	
	// 글 삭제
	@PostMapping("/delete-post")
	public String deletePost(Long boardId) {
		boardService.deletePost(boardId);
		return "redirect:/";
	}
}
