package com.eta.jkm.data;

import java.util.Map;

// Map과 HaspMap 사용을 위한 인터페이스
public interface DataInterface {

	Map<String, Object> getInfoDatas();

	Map<String, Object> getInfoData(int shipId);

	Map<String, Object> getShipDatas();

	Map<String, Object> getShipData(int shipId);

	Map<String, Object> getArrivalportDatas();

	Map<String, Object> getArrivalportData(String arrivalName);

	Map<String, Object> getSchedulesDatas();

	Map<String, Object> getSchedulesData(int ship_shipId);

	Map<String, Object> getWeatherDatas();

	Map<String, Object> getWeatherData(String obsId);

}
