package com.gura.spring05.member.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring05.member.dto.MemberDto;

//스프링이 객체를 관리하게 하기위해 (bean으로 만들어서)
@Repository
public class MemberDaoImpl implements MemberDao{

	//핵심 의존 객체를 spring으로부터 주입 받기 (Dependency Injection)
	@Autowired
	private SqlSession session;
	
	@Override
	public List<MemberDto> getList() { //row가 여러개면 selectList, 한개면 selectOne
		List<MemberDto> list=session.selectList("member.getList");
		return list;
	}

	@Override
	public void delete(int num) {
		session.delete("member.delete", num);
	}
	@Override
	public void insert(MemberDto dto) {
		session.insert("member.insert", dto);
	}

	@Override
	public MemberDto getData(int num) {
		MemberDto dto=session.selectOne("member.getData", num);
		return dto;
	}

	@Override
	public void update(MemberDto dto) {
		session.update("member.update", dto);
		
	}

	@Override
	public List<Map<String, Object>> getList2() {
		
		List<Map<String, Object>> list=session.selectList("member.getList2");
		
		return list;
	}

	@Override
	public List<Map<String, Object>> memberGetList() {
		
		return session.selectList("member.memberGetList");
	}

}
