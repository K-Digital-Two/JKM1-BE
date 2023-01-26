package com.eta.jkm.domain;

import java.util.Date;

public class WeatherVO {
	private String obsId; // 관측소 ID
	private Date time; // 관측시간
	private Double temp; // 기온
	private int pressure; // 기압
	private int windDirec; // 풍향
	private Double windSpeed; // 풍속
	private Double obsLat; // 관측소 위도
	private Double obsLon; // 관측소 경도
	private Double titdeLevel; // 조위

	public WeatherVO() {
	}

	public WeatherVO(String obsId, Date time, Double temp, int pressure, int windDirec, Double windSpeed, Double obsLat,
			Double obsLon, Double titdeLevel) {
		super();
		this.obsId = obsId;
		this.time = time;
		this.temp = temp;
		this.pressure = pressure;
		this.windDirec = windDirec;
		this.windSpeed = windSpeed;
		this.obsLat = obsLat;
		this.obsLon = obsLon;
		this.titdeLevel = titdeLevel;
	}

	public String getObsId() {
		return obsId;
	}

	public void setObsId(String obsId) {
		this.obsId = obsId;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getWindDirec() {
		return windDirec;
	}

	public void setWindDirec(int windDirec) {
		this.windDirec = windDirec;
	}

	public Double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public Double getObsLat() {
		return obsLat;
	}

	public void setObsLat(Double obsLat) {
		this.obsLat = obsLat;
	}

	public Double getObsLon() {
		return obsLon;
	}

	public void setObsLon(Double obsLon) {
		this.obsLon = obsLon;
	}

	public Double getTitdeLevel() {
		return titdeLevel;
	}

	public void setTitdeLevel(Double titdeLevel) {
		this.titdeLevel = titdeLevel;
	}

	@Override
	public String toString() {
		return "WeatherVO [obsId=" + obsId + ", time=" + time + ", temp=" + temp + ", pressure=" + pressure
				+ ", windDirec=" + windDirec + ", windSpeed=" + windSpeed + ", obsLat=" + obsLat + ", obsLon=" + obsLon
				+ ", titdeLevel=" + titdeLevel + "]";
	}

}
