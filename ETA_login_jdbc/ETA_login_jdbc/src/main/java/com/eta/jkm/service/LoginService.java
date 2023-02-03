package com.eta.jkm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eta.jkm.dao.LoginDao;
import com.eta.jkm.domain.UserVO;

@Service
public class LoginService {

	private LoginDao dao;

	@Autowired
	public LoginService(LoginDao dao) {
		super();
		this.dao = dao;
	}

	public UserVO getUser(String id) {
		return dao.getUser(id);
	}

	public int addUser(UserVO userVO) {
		return dao.addUser(userVO);
	}

	public int updateUser(String pw, String id) {
		return dao.updateUser(pw, id);
	}

	public int deleteUser(String id) {
		return dao.deleteUser(id);
	}

}
