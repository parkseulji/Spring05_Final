package com.gura.spring05.cafe.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring05.cafe.dto.CafeCommentDto;

@Repository
public class CafeCommentDaoImpl implements CafeCommentDao{
	@Autowired
	private SqlSession session;
	
	//인자로 전달 된 그룹번호(원 글의 글번호) 에 해당하는 댓글 목록 얻어오기
	@Override
	public List<CafeCommentDto> getList(int ref_group) { //parameterType:int , resultType:CafeCommentDto
		
		return session.selectList("cafeComment.getList", ref_group); //sqlId:getList
	}

	@Override
	public void delete(int num) { //parameterType:int
		session.update("cafeComment.delete", num); //sqlId:delete
	}

	@Override
	public void insert(CafeCommentDto dto) {
		session.insert("cafeComment.insert", dto);
	}
	//저장 할 댓글의 글번호를 리턴하는 메소드
	@Override
	public int getSequence() {
		//시퀀스 값을 얻어내서
		int seq=session.selectOne("cafeComment.getSequence");
		//리턴 해 준다.
		return seq;
	}

	@Override
	public void update(CafeCommentDto dto) {
		session.update("cafeComment.update", dto);
	}
	
}
