package com.eta.jkm.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//로그 기록
@Repository
public class LogDaoSQLImpl implements LogDao {

	private static final Logger log = LoggerFactory.getLogger(LogDaoSQLImpl.class);

	private JdbcTemplate jdbcTemplate;

	public LogDaoSQLImpl() {
		log.info("LogDaoSQLImpl() 생성자 호출됨.");
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		log.info("LogDaoSQLImpl - setJdbcTemplate() 호출됨.");
	}

	@Override
	public void addLog(String method, String sqlstring, boolean success) {

//		String sqlString = "insert into dblog (method,sqlstring,success) values (?,?,?)";
//		try {
//			jdbcTemplate.update(sqlString, method, sqlstring, success);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
