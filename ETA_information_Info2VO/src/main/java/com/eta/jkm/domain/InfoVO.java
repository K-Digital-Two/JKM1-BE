package com.eta.jkm.domain;

import java.util.Date;

public class InfoVO {

	private int shipId; // mmsi
	private String shipName; // 선박명
	private String shipUse; // 선박용도
	private double shipLat; // 선박 현재 위도
	private double shipLon; // 선박 현재 경도
	private int takeTime; // 소요 예정 시간
	private double speed; // 선박속도
	private String departure; // 출발지
	private Date departTime; // 출발시각
	private String arrivalName; // 도착지
	private Date arrivalTime; // 도착 예정 시각
	private double accuracy; // 정확도

	private int schedules_ship_shipId; // 선박 mmsi
	private Date insertTime; // 입력시간

	public InfoVO() {
	}

	public InfoVO(int shipId, String shipName, String shipUse, double shipLat, double shipLon, int takeTime,
			double speed, String departure, Date departTime, String arrivalName, Date arrivalTime, double accuracy,
			int schedules_ship_shipId, Date insertTime) {
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
		this.schedules_ship_shipId = schedules_ship_shipId;
		this.insertTime = insertTime;
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

	public Date getDepartTime() {
		return departTime;
	}

	public void setDepartTime(Date departTime) {
		this.departTime = departTime;
	}

	public String getArrivalName() {
		return arrivalName;
	}

	public void setArrivalName(String arrivalName) {
		this.arrivalName = arrivalName;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public double getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}

	public int getSchedules_ship_shipId() {
		return schedules_ship_shipId;
	}

	public void setSchedules_ship_shipId(int schedules_ship_shipId) {
		this.schedules_ship_shipId = schedules_ship_shipId;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	@Override
	public String toString() {
		return "InfoVO [shipId=" + shipId + ", shipName=" + shipName + ", shipUse=" + shipUse + ", shipLat=" + shipLat
				+ ", shipLon=" + shipLon + ", takeTime=" + takeTime + ", speed=" + speed + ", departure=" + departure
				+ ", departTime=" + departTime + ", arrivalName=" + arrivalName + ", arrivalTime=" + arrivalTime
				+ ", accuracy=" + accuracy + ", schedules_ship_shipId=" + schedules_ship_shipId + ", insertTime="
				+ insertTime + "]";
	}

}
