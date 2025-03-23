package com.board.mapper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.model.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTest {
	@Autowired
	BoardMapper bm;

//	@Autowired
//	ApplicationContext context;
//
//	@Test
//	public void test() {
//		System.out.println("BoardMapper bean? " + context.containsBeanDefinition("boardMapper"));
//		System.out.println("bm is null? " + (bm == null));
//	}

//	@Test
//	public void insertTest() {
//		Board b = Board.builder()
//				.boardTitle("테스트 제목")
//				.boardContent("테스트 내용")
//				.boardWriter("테스트 작성자")
//				.build();
//		
//		bm.insertBoard(b);
//	}
	
	@Test
	public void selectTest() {
		Board b = bm.selectBoard(2L);
		assertEquals("익명의 작성자", b.getBoardWriter());
		System.out.println(b);
	}

}
