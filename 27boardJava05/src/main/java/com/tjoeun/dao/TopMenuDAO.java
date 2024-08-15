package com.tjoeun.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tjoeun.dto.BoardInfoTable;
import com.tjoeun.mapper.TopMenuMapper;

@Repository
public class TopMenuDAO {
	
	@Autowired
	private TopMenuMapper topMenuMapper;
	
	public List<BoardInfoTable> getTopMenuList(){
		List<BoardInfoTable> topMenuList = topMenuMapper.getTopMenuList();
		return topMenuList;
	}
	
}
