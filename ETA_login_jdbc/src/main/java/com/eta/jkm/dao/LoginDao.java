package com.eta.jkm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import com.eta.jkm.domain.UserVO;

@Repository
public class LoginDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public LoginDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public UserVO getUser(String id) {
		String sqlString = String.format("select id, pw from user where id = '%s'", id);
		UserVO user = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<UserVO>(UserVO.class));
		return user;
	}

	public int addUser(UserVO userVO) {
		return jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String query = "insert into user (id, pw) value (?, ?)";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, userVO.getId());
				pstmt.setString(2, userVO.getPw());
				return pstmt;
			}
		});
	}

	public int updateUser(String id, String pw) {
		String sqlString = String.format("update user set pw = '%s' where id = '%s'", pw, id);
		int user = jdbcTemplate.update(sqlString);
		return user;
	}

	public int deleteUser(String id) {
		String sqlString = String.format("delete from user where id = '%s'", id);
		int user = jdbcTemplate.update(sqlString);
		return user;
	}

}
