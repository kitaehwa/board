package com.itwillbs.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.itwillbs.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	// 디비 연결정보를 처리하는 객체를 주입
	@Inject
	private SqlSession sqlSession;
	
	private static final Logger logger 
	= LoggerFactory.getLogger(BoardDAOImpl.class);
	
	private static final String NameSpace="com.itwillbs.mapper.BoardMapper.";
	
	@Override
	public void createBoard(BoardVO vo) throws Exception {
		logger.debug("createBoard(BoardVO vo) 호출");
		logger.debug("디비 연결 - SQL 호출 - 실행");
		sqlSession.insert(NameSpace+"insertBoard", vo);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		logger.debug("listAll() 호출");
		
		return sqlSession.selectList(NameSpace+"listAll");
	}
	
	
	
	

}
