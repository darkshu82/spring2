package com.tjoeun.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.tjoeun.dto.ContentDTO;
import com.tjoeun.dto.UserDTO;
import com.tjoeun.service.BoardService;

public class CheckWriterInterceptor implements HandlerInterceptor{
	private UserDTO loginUserDTO;
	private BoardService boardService;
	
	public CheckWriterInterceptor(UserDTO loginUserDTO, BoardService boardService) {
		this.loginUserDTO = loginUserDTO;
		this.boardService = boardService;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		int contentIdx = Integer.parseInt(request.getParameter("content_idx"));
		ContentDTO contentDTO = boardService.getContent(contentIdx);
		
		if(contentDTO.getContent_writer_idx() == loginUserDTO.getUser_idx()) {
			String contextPath = request.getContextPath();
			response.sendRedirect("contextPath/board/cant_writer");
			return false;
		}
		return true;
		
	} // preHandle
		
		

	
}
