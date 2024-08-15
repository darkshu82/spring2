package com.tjoeun.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.tjoeun.dao.UserDAO;
import com.tjoeun.dto.UserDTO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Resource(name="loginUserDTO")
	@Lazy
	private UserDTO loginUserDTO;
	
	public boolean checkUserIdExist(String user_id) {
		String user_name = userDAO.checkUserIdExist(user_id);
		
		if(user_name == null) {
			return true;
		}
		return false;
	}
	
	public void insertUser(UserDTO joinUserDTO) {
		userDAO.insertUser(joinUserDTO);
	}
	
	public UserDTO getLoginUserInfo(UserDTO validationLoginUserDTO) {
		
		UserDTO tmpUserDTO = userDAO.getLoginUserInfo(validationLoginUserDTO);
		
		if(tmpUserDTO != null) {
			loginUserDTO.setUser_idx(tmpUserDTO.getUser_idx());
			loginUserDTO.setUser_name(tmpUserDTO.getUser_name());
			loginUserDTO.setUserIsLogin(true);		
		}
		
		return tmpUserDTO;
	}
	
}
