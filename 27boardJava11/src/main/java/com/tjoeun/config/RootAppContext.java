package com.tjoeun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import com.tjoeun.dto.UserDTO;

// project 작업할 때 생성하는 bean을 정의하는 클래스
@Configuration
public class RootAppContext {
	
	@Bean("loginUserDTO")
	@SessionScope
	public UserDTO loginUserDTO() {
		return new UserDTO();
	}

}
