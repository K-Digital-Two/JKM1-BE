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

	public List<ShiplogVO> getLogs() {
		String sqlString = String.format(
				"select shipId, shipName, shipUse, shipLat, shipLon, takeTime, speed, departure, departTime, arrivalPort_arrivalName as arrivalName, arrivalTime, accuracy, max(insertTime)\r\n"
				+ "	from ship, schedules s, shiplog sl, arrivalPort a\r\n"
				+ "	where TIMEDIFF('2023-01-19 16:30:00', insertTime) > 0\r\n"
				+ "	and shipId = s.ship_shipId \r\n"
				+ " and shipId = sl.schedules_ship_shipId \r\n"
				+ " and s.arrivalPort_arrivalName = a.arrivalName \r\n"
				+ " group by shipId;");
		List<ShiplogVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<ShiplogVO>(ShiplogVO.class));
		return list;
	}

	public ShiplogVO getLog(Integer shipId) {
		String sqlString = String.format(
				"select shipId, shipName, shipUse, shipLat, shipLon, takeTime, speed, departure, departTime, arrivalPort_arrivalName as arrivalName, arrivalTime, accuracy, insertTime\r\n"
				+ "	from ship, schedules s, shiplog sl, arrivalPort a\r\n"
				+ "	where insertTime = (\r\n"
				+ "		select max(insertTime) from shiplog\r\n"
				+ "     where TIMEDIFF('2023-01-19 16:30:00', insertTime) > 0\r\n"
				+ "    )\r\n"
				+ "	and shipId = s.ship_shipId \r\n"
				+ " and shipId = sl.schedules_ship_shipId \r\n"
				+ " and s.arrivalPort_arrivalName = a.arrivalName \r\n"
				+ " and shipId = %d;",
				shipId);
		ShiplogVO info = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<ShiplogVO>(ShiplogVO.class));
		return info;
	}

	public List<ShiplogVO> getLocations(Integer shipId) {
		String sqlString = String.format(
				"select shipId, shipLat, shipLon, shipName \r\n"
				+ "from ship, shiplog sl \r\n"
				+ "where ship.shipId = sl.schedules_ship_shipId \r\n"
				+ "and TIMEDIFF('2023-01-19 16:30:00', insertTime) > 0\r\n"
				+ "and shipId = %d;",
				shipId);
		List<ShiplogVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<ShiplogVO>(ShiplogVO.class));
		return list;
	}
}