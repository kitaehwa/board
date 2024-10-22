package com.itwillbs.service;

import com.itwillbs.domain.BoardVO;
import java.util.List;

public interface BoardService {
	
	// 글쓰기
	public void regist(BoardVO vo) throws Exception;
	
	// 글 리스트 조회
	public List<BoardVO> listAll() throws Exception;
	
	// 글 본문 조회
	public BoardVO read(int bno) throws Exception;
	
	// 글 조회수 1증가
	public void updateViewcnt(int bno) throws Exception;
	
	// 글 정보 수정 동작
	public void modify(BoardVO vo) throws Exception;
	
	// 글 정보 삭제 동작
	public int remove(int bno) throws Exception;
	
	
}
