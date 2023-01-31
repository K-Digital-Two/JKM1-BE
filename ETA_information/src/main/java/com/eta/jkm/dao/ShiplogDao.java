package com.eta.jkm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.eta.jkm.domain.ShiplogVO;

@Repository
public class ShiplogDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public ShiplogDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<ShiplogVO> getLogs(Integer timeGroup) {
		String sqlString = String.format(
				"select shipId, shipName, shipUse, shipLat, shipLon, takeTime, speed, departure, departTime, arrivalPort_arrivalName as arrivalName, arrivalTime, accuracy, insertTime\r\n"
				+ "from ship, schedules s, shiplog sl, arrivalPort a\r\n"
				+ "where timeGroup = %d\r\n"
				+ "and shipId = s.ship_shipId\r\n"
				+ "and shipId = sl.schedules_ship_shipId\r\n"
				+ "and s.arrivalPort_arrivalName = a.arrivalName\r\n"
				+ "group by shipId;",
				timeGroup);
		List<ShiplogVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<ShiplogVO>(ShiplogVO.class));
		return list;
	}

	public ShiplogVO getLog(Integer timeGroup, Integer shipId) {
		String sqlString = String.format(
				"select shipId, shipName, shipUse, shipLat, shipLon, takeTime, speed, departure, departTime, arrivalPort_arrivalName as arrivalName, arrivalTime, accuracy, insertTime\r\n"
				+ "	from ship, schedules s, shiplog sl, arrivalPort a\r\n"
				+ "	where timeGroup = %d \r\n"
				+ "	and shipId = s.ship_shipId \r\n"
				+ " and shipId = sl.schedules_ship_shipId \r\n"
				+ " and s.arrivalPort_arrivalName = a.arrivalName \r\n"
				+ " and shipId = %d;",
				timeGroup, shipId);
		ShiplogVO info = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<ShiplogVO>(ShiplogVO.class));
		return info;
	}

	public List<ShiplogVO> getLocations(Integer timeGroup, Integer shipId) {
		String sqlString = String.format(
				"select shipId, shipLat, shipLon, insertTime \r\n"
				+ " from ship, shiplog sl \r\n"
				+ " where shipId = sl.schedules_ship_shipId \r\n"
				+ " and timeGroup <= %d \r\n"
				+ " and shipId = %d;",
				timeGroup, shipId);
		List<ShiplogVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<ShiplogVO>(ShiplogVO.class));
		return list;
	}
}