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

	// 지도 위 마커 표시를 위한 메소드
	public List<ShiplogVO> getLogs(Integer timeGroup) {
		String sqlString = String.format(
			// 필요한 정보 가져오기
			"select shipId, shipName, shipUse, shipLat, shipLon, takeTime, speed, departure, departTime, arrivalPort_arrivalName as arrivalName, arrivalTime, accuracy, insertTime, status\r\n"
			// 가져올 테이블
			+ "from ship, schedules s, shiplog sl, arrivalport a\r\n"
			// 조건 설정
			// 데이터 입력 시각 - emulator 활용으로 동일한 시각에 보고한다는 전제 하에 넘버링 사용
			// 실제 서비스를 진행하고자 할 때에는 관련 코드 별도 작성 필요
			+ "where timeGroup = %d\r\n"
			+ "and shipId = s.ship_shipId\r\n"						// ship, schedule 테이블 연결
			+ "and shipId = sl.ship_shipId\r\n"						// ship, shiplog 테이블 연결
			+ "and s.arrivalPort_arrivalName = a.arrivalName\r\n"	// ship, arrivalport 테이블 연결
			+ "group by shipId;",									// shipId(mmsi) 기준으로 그룹화
			timeGroup);
		List<ShiplogVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<ShiplogVO>(ShiplogVO.class));
		return list;
	}

	// timeGroup에 따른 특정 선박 정보 표시를 위한 메소드
	public ShiplogVO getLog(Integer timeGroup, Integer shipId) {
		String sqlString = String.format(
			// 필요한 정보 가져오기
			"select shipId, shipName, shipUse, shipLat, shipLon, takeTime, speed, departure, departTime, arrivalPort_arrivalName as arrivalName, arrivalTime, accuracy, insertTime, status\r\n"
			// 가져올 테이블
			+ "from ship, schedules s, shiplog sl, arrivalport a\r\n"
			// 조건 설정
			// 데이터 입력 시각 - emulator 활용으로 동일한 시각에 보고한다는 전제 하에 넘버링 사용
			// 실제 서비스를 진행하고자 할 때에는 관련 코드 별도 작성 필요
			+ "where timeGroup = %d \r\n"
			+ "and shipId = s.ship_shipId \r\n"						// ship, schedule 테이블 연결
			+ "and shipId = sl.ship_shipId \r\n"					// ship, shiplog 테이블 연결
			+ "and s.arrivalPort_arrivalName = a.arrivalName \r\n"	// ship, arrivalport 테이블 연결
			+ "and shipId = %d;",									// 조회할 shipId(mmsi)
			timeGroup, shipId);
		ShiplogVO info = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<ShiplogVO>(ShiplogVO.class));
		return info;
	}
	
	// 전체 선박의 운항 경로 표시를 위한 메소드
	public List<ShiplogVO> getLocations(Integer timeGroup) {
		String sqlString = String.format(
			// 필요한 정보 가져오기
			"select shipId, shipLat, shipLon, takeTime, insertTime \r\n"
			// 가져올 테이블
			+ "from ship, shiplog sl \r\n"
			// 조건 설정
			+ "where shipId = sl.ship_shipId \r\n"	// ship, shiplog 테이블 연결
			+ "and timeGroup = %d;",				// 데이터 입력 시각
			timeGroup);
		List<ShiplogVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<ShiplogVO>(ShiplogVO.class));
		return list;
	}
	
	// 특정 선박의 운항 경로 표시를 위한 메소드
	public List<ShiplogVO> getLocations(Integer timeGroup, Integer shipId) {
		String sqlString = String.format(
			// 필요한 정보 가져오기
			"select shipId, shipLat, shipLon, takeTime, insertTime \r\n"
			// 가져올 테이블
			+ "from ship, shiplog sl \r\n"
			// 조건 설정
			+ "where shipId = sl.ship_shipId \r\n"	// ship, shiplog 테이블 연결
			+ "and timeGroup = %d \r\n"				// 데이터 입력 시각
			+ "and shipId = %d;",					// 조회할 shipId(mmsi)
			timeGroup, shipId);
		List<ShiplogVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<ShiplogVO>(ShiplogVO.class));
		return list;
	}
}