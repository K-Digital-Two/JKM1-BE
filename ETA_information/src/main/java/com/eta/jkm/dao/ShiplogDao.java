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
	            + "from ship ship, schedules s, shiplog sl, arrivalPort a \r\n"
	            + "where ship.shipId = s.ship_shipId and s.ship_shipId = sl.schedules_ship_shipId and s.arrivalPort_arrivalName = a.arrivalName\r\n"
	            + "group by shipId;");
	      List<ShiplogVO> list = jdbcTemplate.query(sqlString, 
	            new BeanPropertyRowMapper<ShiplogVO>(ShiplogVO.class));
	      return list;
	   }
	   
	   public ShiplogVO getLog(Integer shipId) {
	      String sqlString = String.format(
	            "select shipId, shipName, shipUse, shipLat, shipLon, takeTime, speed, departure, departTime, arrivalPort_arrivalName as arrivalName, arrivalTime, accuracy, max(insertTime)\r\n"
	                  + "from ship ship, schedules s, shiplog sl, arrivalPort a \r\n"
	                  + "where ship.shipId = s.ship_shipId and s.ship_shipId = sl.schedules_ship_shipId and s.arrivalPort_arrivalName = a.arrivalName and ship.shipId=%d \r\n"
	                  + "group by shipId;"
	            , shipId);
	      ShiplogVO info = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<ShiplogVO>(ShiplogVO.class));
	      return info;
	   }
	   
		public List<ShiplogVO> getLocations() {
			String sqlString = String.format(
					"select shipId, shipLat, shipLon from ship, shiplog sl where ship.shipId = sl.schedules_ship_shipId");
			List<ShiplogVO> list = jdbcTemplate.query(
					sqlString, new BeanPropertyRowMapper<ShiplogVO>(ShiplogVO.class));
			return list;
		}
}
