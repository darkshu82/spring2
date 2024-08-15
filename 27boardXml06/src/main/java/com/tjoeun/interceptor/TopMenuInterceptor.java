package com.tjoeun.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import com.tjoeun.dto.BoardInfoDTO;
import com.tjoeun.service.TopMenuService;

public class TopMenuInterceptor implements HandlerInterceptor{
	
	@Autowired
	private TopMenuService topMenuService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		List<BoardInfoDTO> topMenuList = topMenuService.getTopMenuList();
		request.setAttribute("topMenuList", topMenuList);
		
		return true;
	}
	
}
