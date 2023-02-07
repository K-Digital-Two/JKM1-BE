package com.eta.jkm.domain;

import java.sql.Time;

public class ShiplogVO {

	private int shipId;			// mmsi
	private String shipName;	// 선박명
	private String shipUse;		// 선박용도
	private String insertTime;	// 데이터 입력 시각
	private double shipLat;		// 선박 현재 위도
	private double shipLon;		// 선박 현재 경도
	private Time takeTime;		// 소요 예정 시간
	private Time totalTakeTime;	// 총 소요 예정 시간
	private double speed;		// 선박속도
	private String departure;	// 출발지
	private String departTime;	// 출발시각
	private String arrivalName;	// 도착지
	private String arrivalTime;	// 도착 예정 시각
	private double accuracy;	// 정확도
	private int status;			// 운항상태
	
	public ShiplogVO() {
		// TODO Auto-generated constructor stub
	}

	public ShiplogVO(int shipId, String shipName, String shipUse, String insertTime, double shipLat, double shipLon,
			Time takeTime, Time totalTakeTime, double speed, String departure, String departTime, String arrivalName,
			String arrivalTime, double accuracy, int status) {
		super();
		this.shipId = shipId;
		this.shipName = shipName;
		this.shipUse = shipUse;
		this.insertTime = insertTime;
		this.shipLat = shipLat;
		this.shipLon = shipLon;
		this.takeTime = takeTime;
		this.totalTakeTime = totalTakeTime;
		this.speed = speed;
		this.departure = departure;
		this.departTime = departTime;
		this.arrivalName = arrivalName;
		this.arrivalTime = arrivalTime;
		this.accuracy = accuracy;
		this.status = status;
	}

	@Override
	public String toString() {
		return "ShiplogVO [shipId=" + shipId + ", shipName=" + shipName + ", shipUse=" + shipUse + ", insertTime="
				+ insertTime + ", shipLat=" + shipLat + ", shipLon=" + shipLon + ", takeTime=" + takeTime
				+ ", totalTakeTime=" + totalTakeTime + ", speed=" + speed + ", departure=" + departure + ", departTime="
				+ departTime + ", arrivalName=" + arrivalName + ", arrivalTime=" + arrivalTime + ", accuracy="
				+ accuracy + ", status=" + status + "]";
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

	public String getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
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

	public Time getTakeTime() {
		return takeTime;
	}

	public void setTakeTime(Time takeTime) {
		this.takeTime = takeTime;
	}

	public Time getTotalTakeTime() {
		return totalTakeTime;
	}

	public void setTotalTakeTime(Time totalTakeTime) {
		this.totalTakeTime = totalTakeTime;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
