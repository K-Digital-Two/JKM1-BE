package com.eta.jkm.domain;

import java.util.Date;

public class WeatherVO {
	private int num; // 항목번호
	private String obsId; // 관측소 ID
	private Date time; // 관측시간
	private Double temp; // 기온
	private Double pressure; // 기압
	private int windDirec; // 풍향
	private Double windSpeed; // 풍속
	private Double obsLat; // 관측소 위도
	private Double obsLon; // 관측소 경도
	private int tideLevel; // 조위

	public WeatherVO() {
	}

	public WeatherVO(int num, String obsId, Date time, Double temp, Double pressure, int windDirec, Double windSpeed,
			Double obsLat, Double obsLon, int tideLevel) {
		super();
		this.num = num;
		this.obsId = obsId;
		this.time = time;
		this.temp = temp;
		this.pressure = pressure;
		this.windDirec = windDirec;
		this.windSpeed = windSpeed;
		this.obsLat = obsLat;
		this.obsLon = obsLon;
		this.tideLevel = tideLevel;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public Double getPressure() {
		return pressure;
	}

	public void setPressure(Double pressure) {
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

	public int getTideLevel() {
		return tideLevel;
	}

	public void setTideLevel(int tideLevel) {
		this.tideLevel = tideLevel;
	}

	@Override
	public String toString() {
		return "WeatherVO [num=" + num + ", obsId=" + obsId + ", time=" + time + ", temp=" + temp + ", pressure="
				+ pressure + ", windDirec=" + windDirec + ", windSpeed=" + windSpeed + ", obsLat=" + obsLat
				+ ", obsLon=" + obsLon + ", tideLevel=" + tideLevel + "]";
	}

}
