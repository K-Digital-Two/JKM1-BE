package com.eta.jkm.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.eta.jkm.dao.LoginDao;
import com.eta.jkm.domain.MemberVO;

public class LoginService {

	private LoginDao dao;

	@Autowired
	public LoginService(LoginDao dao) {
		super();
		this.dao = dao;
	}

	public MemberVO getSignin() {
		return dao.getSignin();
	}

	public MemberVO getSignup() {
		return dao.getSignup();
	}

	public MemberVO getEdit() {
		return dao.getEdit();
	}

	public MemberVO getRemove() {
		return dao.getRemove();
	}

}
