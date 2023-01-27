package com.eta.jkm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.eta.jkm.domain.Info2VO;
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
		List<InfoVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<InfoVO>(InfoVO.class));
		return list;
	}

	public InfoVO getInfo(Integer shipId) {
		String sqlString = String.format(
				"select shipId, shipName, shipUse, shipLat, shipLon, takeTime, speed, departure, departTime, arrivalPort_arrivalName as arrivalName, arrivalTime, accuracy from ship ship, schedules s, info i, arrivalPort a where ship.shipId = s.ship_shipId and s.ship_shipId = i.schedules_ship_shipId and s.arrivalPort_arrivalName = a.arrivalName and ship.shipId=%d",
				shipId);
		InfoVO info = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<InfoVO>(InfoVO.class));
		return info;
	}

	public List<Info2VO> getInfos2() {
		String sqlString = String.format(
				"select shipId as shipId, shipLat, shipLon from ship ship, info i where ship.shipId = i.schedules_ship_shipId");
		List<Info2VO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<Info2VO>(Info2VO.class));
		return list;
	}
//
//	public Info2VO getInfo2(Integer shipId) {
//		String sqlString = String.format(
//				"select shipId as shipId, shipLat, shipLon from ship ship, info i where ship.shipId = i.schedules_ship_shipId and shipId = %d",
//				shipId);
////		Info2VO info = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<Info2VO>(Info2VO.class));
//		List<Info2VO> info = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<Info2VO>(Info2VO.class));
//		return info.get(0);
//	}
	
	public List<Info2VO> getInfo2(Integer shipId) {
		String sqlString = String.format(
				"select shipId as shipId, shipLat, shipLon from ship ship, info i where ship.shipId = i.schedules_ship_shipId and shipId = %d",
				shipId);
		List<Info2VO> info = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<Info2VO>(Info2VO.class));
		return info;
	}

	// select schedules_ship_shipId as shipId, shipLat, shipLon from info where
	// schedules_ship_shipId = %d
}
