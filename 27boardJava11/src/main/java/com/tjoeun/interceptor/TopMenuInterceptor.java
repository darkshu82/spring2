package com.tjoeun.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.tjoeun.dto.BoardInfoDTO;
import com.tjoeun.dto.UserDTO;
import com.tjoeun.service.TopMenuService;

public class TopMenuInterceptor implements HandlerInterceptor{
	
	private TopMenuService topMenuService;
	private UserDTO loginUserDTO;
	
	// 생성자를 통해서 객체를 할당함
	public TopMenuInterceptor(TopMenuService topMenuService, UserDTO loginUserDTO) {
		this.topMenuService = topMenuService;
		this.loginUserDTO = loginUserDTO;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		List<BoardInfoDTO> topMenuList = topMenuService.getTopMenuList();
		request.setAttribute("topMenuList", topMenuList);
		request.setAttribute("loginUserDTO", loginUserDTO);
		return true;   
	}

}