package com.eta.jkm.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.eta.jkm.domain.ArrivalportVO;
import com.eta.jkm.domain.InfoVO;
import com.eta.jkm.domain.SchedulesVO;
import com.eta.jkm.domain.ShipVO;
import com.eta.jkm.domain.WeatherVO;

@Repository
public class DataDao implements DataInterface {

	private static final Logger log = LoggerFactory.getLogger(DataDao.class);

	private JdbcTemplate jdbcTemplate;
	// JdbdTemplate 사용 > db연결정보는 application.properties에 입력

	public DataDao() {
		log.info("DataDaoSQLImpl() 생성자 호출됨.");
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		log.info("DataDaoSQLImpl - setJdbcTemplate() 호출됨.");
	}

	@Override
	public Map<String, Object> getInfoDatas() { // info 테이블 가져오기
		String sqlString = "select * from info";
		Map<String, Object> ret = new HashMap<>();
		ret.put("sql", sqlString);
		try {
			List<InfoVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<InfoVO>(InfoVO.class));
			// RowMapper : ResultSet 에서 값을 추출하여 원하는 객체로 변환
			// BeanPropertyRowMapper : ResultSet -> Bean 으로 변환
			// ColumnMapRowMapper : ResultSet -> Map 으로 변환
			ret.put("data", list);
		} catch (Exception e) {
			ret.put("data", null);
		}
		return ret;
	}

	@Override
	public Map<String, Object> getInfoData(int shipId) { // info 테이블 schedules_ship_shipId 컬럼 특정 값 가져오기
		Map<String, Object> ret = new HashMap<>();
		String sqlString = String.format("select * from info where schedules_ship_shipId=%d", shipId);
		ret.put("sql", sqlString);
		try {
			InfoVO data = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<InfoVO>(InfoVO.class));
			// queryForObject => 쿼리 수행결과가 하나일 때 => 객체로 반환
			// query => 쿼리 수행결과가 여러개일 때 => 리스트로 반환
			ret.put("data", data);
		} catch (Exception e) {
			ret.put("data", null);
		}
		return ret;
	}

	@Override
	public Map<String, Object> getShipDatas() {
		String sqlString = "select * from ship";
		Map<String, Object> ret = new HashMap<>();
		ret.put("sql", sqlString);
		try {
			List<ShipVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<ShipVO>(ShipVO.class));
			ret.put("data", list);
		} catch (Exception e) {
			ret.put("data", null);
		}
		return ret;
	}

	@Override
	public Map<String, Object> getShipData(int shipId) {
		Map<String, Object> ret = new HashMap<>();
		String sqlString = String.format("select * from ship where shipId=%d", shipId);
		ret.put("sql", sqlString);
		try {
			ShipVO data = jdbcTemplate.queryForObject(sqlString, new BeanPropertyRowMapper<ShipVO>(ShipVO.class));
			ret.put("data", data);
		} catch (Exception e) {
			ret.put("data", null);
		}
		return ret;
	}

	@Override
	public Map<String, Object> getArrivalportDatas() {
		String sqlString = "select * from arrivalport";
		Map<String, Object> ret = new HashMap<>();
		ret.put("sql", sqlString);
		try {
			List<ArrivalportVO> list = jdbcTemplate.query(sqlString,
					new BeanPropertyRowMapper<ArrivalportVO>(ArrivalportVO.class));
			ret.put("data", list);
		} catch (Exception e) {
			ret.put("data", null);
		}
		return ret;
	}

	@Override
	public Map<String, Object> getArrivalportData(String arrivalName) {
		Map<String, Object> ret = new HashMap<>();
		String sqlString = String.format("select * from arrivalport where arrivalName=%s", arrivalName);
		ret.put("sql", sqlString);
		try {
			ArrivalportVO data = jdbcTemplate.queryForObject(sqlString,
					new BeanPropertyRowMapper<ArrivalportVO>(ArrivalportVO.class));
			ret.put("data", data);
		} catch (Exception e) {
			ret.put("data", null);
		}
		return ret;
	}

	@Override
	public Map<String, Object> getSchedulesDatas() {
		String sqlString = "select * from schedules";
		Map<String, Object> ret = new HashMap<>();
		ret.put("sql", sqlString);
		try {
			List<SchedulesVO> list = jdbcTemplate.query(sqlString,
					new BeanPropertyRowMapper<SchedulesVO>(SchedulesVO.class));
			ret.put("data", list);
		} catch (Exception e) {
			ret.put("data", null);
		}
		return ret;
	}

	@Override
	public Map<String, Object> getSchedulesData(int ship_shipId) {
		Map<String, Object> ret = new HashMap<>();
		String sqlString = String.format("select * from schedules where ship_shipId=%d", ship_shipId);
		ret.put("sql", sqlString);
		try {
			SchedulesVO data = jdbcTemplate.queryForObject(sqlString,
					new BeanPropertyRowMapper<SchedulesVO>(SchedulesVO.class));
			ret.put("data", data);
		} catch (Exception e) {
			ret.put("data", null);
		}
		return ret;
	}

	@Override
	public Map<String, Object> getWeatherDatas() {
		String sqlString = "select * from weather";
		Map<String, Object> ret = new HashMap<>();
		ret.put("sql", sqlString);
		try {
			List<WeatherVO> list = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<WeatherVO>(WeatherVO.class));
			ret.put("data", list);
		} catch (Exception e) {
			ret.put("data", null);
		}
		return ret;
	}

	@Override
	public Map<String, Object> getWeatherData(String obsId) {
		Map<String, Object> ret = new HashMap<>();
		String sqlString = String.format("select * from weather where obsId=%s", obsId);
		ret.put("sql", sqlString);
		try {
			WeatherVO data = jdbcTemplate.queryForObject(sqlString,
					new BeanPropertyRowMapper<WeatherVO>(WeatherVO.class));
			ret.put("data", data);
		} catch (Exception e) {
			ret.put("data", null);
		}
		return ret;
	}

}
