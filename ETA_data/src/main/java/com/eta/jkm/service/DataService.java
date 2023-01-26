package com.eta.jkm.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eta.jkm.data.DataInterface;
import com.eta.jkm.domain.ArrivalportVO;
import com.eta.jkm.domain.InfoVO;
import com.eta.jkm.domain.SchedulesVO;
import com.eta.jkm.domain.ShipVO;
import com.eta.jkm.domain.WeatherVO;
import com.eta.jkm.log.LogDao;

@Service // 서비스 영역
public class DataService {

	private static final Logger log = LoggerFactory.getLogger(DataService.class);

	private DataInterface dataDao;
	private LogDao logDao;

	public DataService() {
		log.info("DataService() 생성자 호출됨.");
	}

	@Autowired
	public void setDataInterface(DataInterface dataDao) {
		this.dataDao = dataDao;
		log.info("DataService - setDataInterface() 호출됨.");
	}

	@Autowired
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
		log.info("DataService - setLogDao() 호출됨.");
	}

	@SuppressWarnings("unchecked") // 미확인 오퍼레이션과 관련된 경고를 억제
	public List<InfoVO> getInfoDatas() {
		Map<String, Object> map = dataDao.getInfoDatas();
		List<InfoVO> list = (List<InfoVO>) map.get("data");
		if (list != null)
			logDao.addLog("get", (String) map.get("sql"), true);
		else
			logDao.addLog("get", (String) map.get("sql"), false);
		return list;
	}

	public InfoVO getInfoData(int shipId) {
		Map<String, Object> map = dataDao.getInfoData(shipId);
		InfoVO data = (InfoVO) map.get("data");
		if (data != null)
			logDao.addLog("get", (String) map.get("sql"), true);
		else
			logDao.addLog("get", (String) map.get("sql"), false);
		return data;
	}

	@SuppressWarnings("unchecked")
	public List<ShipVO> getShipDatas() {
		Map<String, Object> map = dataDao.getShipDatas();
		List<ShipVO> list = (List<ShipVO>) map.get("data");
		if (list != null)
			logDao.addLog("get", (String) map.get("sql"), true);
		else
			logDao.addLog("get", (String) map.get("sql"), false);
		return list;
	}

	public ShipVO getShipData(int shipId) {
		Map<String, Object> map = dataDao.getShipData(shipId);
		ShipVO data = (ShipVO) map.get("data");
		if (data != null)
			logDao.addLog("get", (String) map.get("sql"), true);
		else
			logDao.addLog("get", (String) map.get("sql"), false);
		return data;
	}

	@SuppressWarnings("unchecked")
	public List<ArrivalportVO> getArrivalportDatas() {
		Map<String, Object> map = dataDao.getArrivalportDatas();
		List<ArrivalportVO> list = (List<ArrivalportVO>) map.get("data");
		if (list != null)
			logDao.addLog("get", (String) map.get("sql"), true);
		else
			logDao.addLog("get", (String) map.get("sql"), false);
		return list;
	}

	public ArrivalportVO getArrivalportData(String arrivalName) {
		Map<String, Object> map = dataDao.getArrivalportData(arrivalName);
		ArrivalportVO data = (ArrivalportVO) map.get("data");
		if (data != null)
			logDao.addLog("get", (String) map.get("sql"), true);
		else
			logDao.addLog("get", (String) map.get("sql"), false);
		return data;
	}

	@SuppressWarnings("unchecked")
	public List<SchedulesVO> getSchedulesDatas() {
		Map<String, Object> map = dataDao.getSchedulesDatas();
		List<SchedulesVO> list = (List<SchedulesVO>) map.get("data");
		if (list != null)
			logDao.addLog("get", (String) map.get("sql"), true);
		else
			logDao.addLog("get", (String) map.get("sql"), false);
		return list;
	}

	public SchedulesVO getSchedulesData(int ship_shipId) {
		Map<String, Object> map = dataDao.getSchedulesData(ship_shipId);
		SchedulesVO data = (SchedulesVO) map.get("data");
		if (data != null)
			logDao.addLog("get", (String) map.get("sql"), true);
		else
			logDao.addLog("get", (String) map.get("sql"), false);
		return data;
	}

	@SuppressWarnings("unchecked")
	public List<WeatherVO> getWeatherDatas() {
		Map<String, Object> map = dataDao.getWeatherDatas();
		List<WeatherVO> list = (List<WeatherVO>) map.get("data");
		if (list != null)
			logDao.addLog("get", (String) map.get("sql"), true);
		else
			logDao.addLog("get", (String) map.get("sql"), false);
		return list;
	}

	public WeatherVO getWeatherData(String obsId) {
		Map<String, Object> map = dataDao.getWeatherData(obsId);
		WeatherVO data = (WeatherVO) map.get("data");
		if (data != null)
			logDao.addLog("get", (String) map.get("sql"), true);
		else
			logDao.addLog("get", (String) map.get("sql"), false);
		return data;
	}

}