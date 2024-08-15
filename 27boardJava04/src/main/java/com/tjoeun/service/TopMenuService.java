package com.tjoeun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjoeun.dao.TopMenuDAO;
import com.tjoeun.dto.BoardInfoTable;

@Service
public class TopMenuService {
	
	@Autowired
	private TopMenuDAO topMenuDAO;
	
	public List<BoardInfoTable> getTopMenuList(){
		List<BoardInfoTable> topMenuList = topMenuDAO.getTopMenuList();
		return topMenuList;
	}
	
}
