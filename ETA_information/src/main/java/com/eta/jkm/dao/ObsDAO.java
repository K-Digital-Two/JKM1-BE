package com.eta.jkm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.eta.jkm.domain.ObsVO;

@Repository("ObsDao")
public class ObsDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public ObsDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<ObsVO> getObs() {
		String sqlString = String.format(
				// 필요한 정보 가져오기
				"SELECT * FROM ship.obs;");
			List<ObsVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<ObsVO>(ObsVO.class));
		return list;
	}
}
