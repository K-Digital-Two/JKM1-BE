package com.eta.jkm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.eta.jkm.domain.InfoVO;

@Repository
public class InfoDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public InfoDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<InfoVO> getInfos() {
		String sqlString = String.format(
				"select shipId, shipName, shipUse, shipLat, shipLon, takeTime, speed, departure, departTime, arrivalPort_arrivalName as arrivalName, arrivalTime, accuracy from ship ship, schedules s, info i, arrivalPort a where ship.shipId = s.ship_shipId and s.ship_shipId = i.schedules_ship_shipId and s.arrivalPort_arrivalName = a.arrivalName");
		List<InfoVO> list = jdbcTemplate.query(sqlString, 
				new BeanPropertyRowMapper<InfoVO>(InfoVO.class));
		return list;
	}
	
	public InfoVO getInfo(Integer shipId) {
		String sqlString = String.format(
				"select shipId, shipName, shipUse, shipLat, shipLon, takeTime, speed, departure, departTime, arrivalPort_arrivalName as arrivalName, arrivalTime, accuracy from ship ship, schedules s, info i, arrivalPort a where ship.shipId = s.ship_shipId and s.ship_shipId = i.schedules_ship_shipId and s.arrivalPort_arrivalName = a.arrivalName and ship.shipId=%d"
				, shipId);
		InfoVO info = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<InfoVO>(InfoVO.class));
		return info;
	}
}
