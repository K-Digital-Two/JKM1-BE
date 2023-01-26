package com.eta.jkm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.eta.jkm.domain.ArrivalportVO;
import com.eta.jkm.domain.InfoVO;
import com.eta.jkm.domain.SchedulesVO;
import com.eta.jkm.domain.ShipVO;
import com.eta.jkm.domain.WeatherVO;
import com.eta.jkm.service.DataService;

@RestController // 객체 데이터를 반환
public class DataController {

	private DataService dataService;

	private static final Logger log = LoggerFactory.getLogger(DataController.class);

	@Autowired
	public DataController(DataService dataService) {
		log.info("DataController() 생성자 호출됨.");
		this.dataService = dataService;
	}

	// Read(읽기) = SELECT(SQL)
	@GetMapping("/info") // info 데이터 전체 가져오기
	public List<InfoVO> getInfoDatas() {
		log.info("DataController - getInfoDatas()가 호출됨.");
		return dataService.getInfoDatas();
	}

	@GetMapping("/info/{shipId}") // info - shidId의 특정 값 가져오기
	public InfoVO getInfoData(@PathVariable int shipId) {
		log.info("DataController - getInfoData(%d)가 호출됨.");
		return dataService.getInfoData(shipId);
	}

	@GetMapping("/ship")
	public List<ShipVO> getShipDatas() {
		log.info("DataController - getShipDatas()가 호출됨.");
		return dataService.getShipDatas();
	}

	@GetMapping("/ship/{shipId}")
	public ShipVO getShipData(@PathVariable int shipId) {
		log.info("DataController - getShipData(%d)가 호출됨.");
		return dataService.getShipData(shipId);
	}

	@GetMapping("/arrivalport")
	public List<ArrivalportVO> getArrivalportDatas() {
		log.info("DataController - getArrivalportDatas()가 호출됨.");
		return dataService.getArrivalportDatas();
	}

	@GetMapping("/arrivalport/{arrivalName}")
	public ArrivalportVO getArrivalportData(@PathVariable String arrivalName) {
		log.info("DataController - getArrivalportData(%s)가 호출됨.");
		return dataService.getArrivalportData(arrivalName);
	}

	@GetMapping("/schedules")
	public List<SchedulesVO> getSchedulesDatas() {
		log.info("DataController - getScheduleDatas()가 호출됨.");
		return dataService.getSchedulesDatas();
	}

	@GetMapping("/schedules/{ship_shipId}")
	public SchedulesVO getSchedulesData(@PathVariable int ship_shipId) {
		log.info("DataController - getSchedulesData(%d)가 호출됨.");
		return dataService.getSchedulesData(ship_shipId);
	}

	@GetMapping("/weather")
	public List<WeatherVO> getWeatherDatas() {
		log.info("DataController - getWeatherDatas()가 호출됨.");
		return dataService.getWeatherDatas();
	}

	@GetMapping("/weather/{obsId}")
	public WeatherVO getWeatherData(@PathVariable String obsId) {
		log.info("DataController - getWeatherData(%s)가 호출됨.");
		return dataService.getWeatherData(obsId);
	}

}
