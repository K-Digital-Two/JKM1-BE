package com.eta.jkm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.eta.jkm.domain.MemberVO;

public class LoginDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public LoginDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public MemberVO getSignin() {
		String sqlString = String.format("select * from ? where ?");
		MemberVO member = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<MemberVO>(MemberVO.class));
		return member;
	}

	public MemberVO getSignup() {
		String sqlString = String.format("insert * from ? where ?");
		MemberVO member = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<MemberVO>(MemberVO.class));
		return member;
	}

	public MemberVO getEdit() {
		String sqlString = String.format("update * from ? where ?");
		MemberVO member = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<MemberVO>(MemberVO.class));
		return member;
	}

	public MemberVO getRemove() {
		String sqlString = String.format("delete * from ? where ?");
		MemberVO member = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<MemberVO>(MemberVO.class));
		return member;
	}

}
