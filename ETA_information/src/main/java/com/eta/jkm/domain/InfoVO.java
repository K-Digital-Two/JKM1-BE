package com.eta.jkm.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InfoVO {

	private int shipId;			// mmsi
	private String shipName;	// 선박명
	private String shipUse;		// 선박용도
	private double shipLat;		// 선박 현재 위도
	private double shipLon;		// 선박 현재 경도
	private int takeTime;		// 소요 예정 시간
	private double speed;		// 선박속도
	private String departure;	// 출발지
	private String departTime;	// 출발시각
	private String arrivalName;	// 도착지
	private String arrivalTime;	// 도착 예정 시각
	private double accuracy;	// 정확도
	
	public InfoVO() {
		// TODO Auto-generated constructor stub
	}

	public InfoVO(int shipId, String shipName, String shipUse, double shipLat, double shipLon, int takeTime,
			double speed, String departure, String departTime, String arrivalName, String arrivalTime,
			double accuracy) {
		super();
		this.shipId = shipId;
		this.shipName = shipName;
		this.shipUse = shipUse;
		this.shipLat = shipLat;
		this.shipLon = shipLon;
		this.takeTime = takeTime;
		this.speed = speed;
		this.departure = departure;
		this.departTime = departTime;
		this.arrivalName = arrivalName;
		this.arrivalTime = arrivalTime;
		this.accuracy = accuracy;
	}

	@Override
	public String toString() {
		return "InfoVO [shipId=" + shipId + ", shipName=" + shipName + ", shipUse=" + shipUse + ", shipLat=" + shipLat
				+ ", shipLon=" + shipLon + ", takeTime=" + takeTime + ", speed=" + speed + ", departure=" + departure
				+ ", departTime=" + departTime + ", arrivalName=" + arrivalName + ", arrivalTime=" + arrivalTime
				+ ", accuracy=" + accuracy + "]";
	}

	public int getShipId() {
		return shipId;
	}

	public void setShipId(int shipId) {
		this.shipId = shipId;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getShipUse() {
		return shipUse;
	}

	public void setShipUse(String shipUse) {
		this.shipUse = shipUse;
	}

	public double getShipLat() {
		return shipLat;
	}

	public void setShipLat(double shipLat) {
		this.shipLat = shipLat;
	}

	public double getShipLon() {
		return shipLon;
	}

	public void setShipLon(double shipLon) {
		this.shipLon = shipLon;
	}

	public int getTakeTime() {
		return takeTime;
	}

	public void setTakeTime(int takeTime) {
		this.takeTime = takeTime;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDepartTime() {
		return departTime;
	}

	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}

	public String getArrivalName() {
		return arrivalName;
	}

	public void setArrivalName(String arrivalName) {
		this.arrivalName = arrivalName;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public double getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}

}
