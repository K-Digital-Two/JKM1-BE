package com.eta.jkm.domain;

import java.util.Date;

public class InfoVO {
	private int schedules_ship_shipId; // 선박 MMSI
	private Date insertTime; // AIS 신호 수신 시각
	private Double shipLat; // 현재 선박 위도
	private Double shipLon; // 현재 선박 경도
	private Double speed; // 선박 속도
	private Date arrivalTime; // 도착 예정 시각
	private int takeTime; // 소요 예정 시각
	private Double accuracy; // 정확도(%)

	public InfoVO() {
	}

	public InfoVO(int schedules_ship_shipId, Date insertTime, Double shipLat, Double shipLon, Double speed,
			Date arrivalTime, int takeTime, Double accuracy) {
		super();
		this.schedules_ship_shipId = schedules_ship_shipId;
		this.insertTime = insertTime;
		this.shipLat = shipLat;
		this.shipLon = shipLon;
		this.speed = speed;
		this.arrivalTime = arrivalTime;
		this.takeTime = takeTime;
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

	public Double getShipLat() {
		return shipLat;
	}

	public void setShipLat(Double shipLat) {
		this.shipLat = shipLat;
	}

	public Double getShipLon() {
		return shipLon;
	}

	public void setShipLon(Double shipLon) {
		this.shipLon = shipLon;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getTakeTime() {
		return takeTime;
	}

	public void setTakeTime(int takeTime) {
		this.takeTime = takeTime;
	}

	public Double getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(Double accuracy) {
		this.accuracy = accuracy;
	}

	@Override
	public String toString() {
		return "InfoVO [schedules_ship_shipId=" + schedules_ship_shipId + ", insertTime=" + insertTime + ", shipLat="
				+ shipLat + ", shipLon=" + shipLon + ", speed=" + speed + ", arrivalTime=" + arrivalTime + ", takeTime="
				+ takeTime + ", accuracy=" + accuracy + "]";
	}

}
