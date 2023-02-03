package com.eta.jkm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
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
		// 길고 복잡한 쿼리문 PreparedStatement 사용
//		return jdbcTemplate.update(new PreparedStatementCreator() {
//			@Override
//			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//				String query = "insert into user (id, pw) value (?, ?)";
		// 파라미터로 전달받은 Connection을 이용해서 PreparedStatement 생성
//				PreparedStatement pstmt = con.prepareStatement(query);
		// 인덱스 파라미터 값 설정
//				pstmt.setString(1, userVO.getId());
//				pstmt.setString(2, userVO.getPw());
		// 생성한 PreparedStatement 객체 리턴
//				return pstmt;
//			}
//		});

		// 짧고 단순한 쿼리문 String.format(문자열 형식 지정) 사용
		String sql = String.format("insert into user (id, pw) value ('%s', '%s')", userVO.getId(), userVO.getPw());
		return jdbcTemplate.update(sql);
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
