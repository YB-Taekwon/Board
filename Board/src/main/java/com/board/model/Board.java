package com.board.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {
	private Long boardId; // 게시글 번호
	private String boardTitle; // 제목
	private String boardContent; // 내용
	private String boardWriter; // 작성자
	private int boardCount;
	private LocalDateTime boardRegistDate; // 등록 일자
	private LocalDateTime boardUpdateDate; // 수정 일자
}
