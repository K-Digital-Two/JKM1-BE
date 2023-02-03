package com.eta.jkm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eta.jkm.domain.UserVO;
import com.eta.jkm.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/signin/{id}") // Read , 로그인
	public UserVO getUser(@PathVariable String id) {
		return loginService.getUser(id);
	}

	@PostMapping("/signup") // Create , 회원가입
	public int addUser(UserVO userVO) {
		return loginService.addUser(userVO);
	}

	@PutMapping("/edit/{id}") // Update , 비밀번호변경
	public int updateUser(@PathVariable String id, String pw) {
		return loginService.updateUser(id, pw);
	}

	@DeleteMapping("/remove/{id}") // Delete , 아이디 삭제
	public int deleteUser(@PathVariable String id) {
		return loginService.deleteUser(id);
	}

}
