package com.eta.jkm.domain;

import java.util.Date;

public class ShiplogVO {
	private int num; // 항목번호
	private int timeGroup; // AIS 수신 시간이 동일한 선박 그룹
	private int ship_shipId; // 선박 MMSI
	private Date insertTime; // AIS 수신 시간
	private Double shipLat; // 선박 호출부호
	private Double shipLon; // 선박명
	private Double speed; // 선박 용도
	private Date arrivalTime; // 도착시간
	private int takeTime; // 소요시간
	private Double accuracy; // 정확도
	private int status; // 상태
	private int totalTakeTime; // 도착·출발 시간

	public ShiplogVO() {
	}

	public ShiplogVO(int num, int timeGroup, int ship_shipId, Date insertTime, Double shipLat, Double shipLon,
			Double speed, Date arrivalTime, int takeTime, Double accuracy, int status, int totalTakeTime) {
		super();
		this.num = num;
		this.timeGroup = timeGroup;
		this.ship_shipId = ship_shipId;
		this.insertTime = insertTime;
		this.shipLat = shipLat;
		this.shipLon = shipLon;
		this.speed = speed;
		this.arrivalTime = arrivalTime;
		this.takeTime = takeTime;
		this.accuracy = accuracy;
		this.status = status;
		this.totalTakeTime = totalTakeTime;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getTimeGroup() {
		return timeGroup;
	}

	public void setTimeGroup(int timeGroup) {
		this.timeGroup = timeGroup;
	}

	public int getShip_shipId() {
		return ship_shipId;
	}

	public void setShip_shipId(int ship_shipId) {
		this.ship_shipId = ship_shipId;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTotalTakeTime() {
		return totalTakeTime;
	}

	public void setTotalTakeTime(int totalTakeTime) {
		this.totalTakeTime = totalTakeTime;
	}

	@Override
	public String toString() {
		return "ShiplogVO [num=" + num + ", timeGroup=" + timeGroup + ", ship_shipId=" + ship_shipId + ", insertTime="
				+ insertTime + ", shipLat=" + shipLat + ", shipLon=" + shipLon + ", speed=" + speed + ", arrivalTime="
				+ arrivalTime + ", takeTime=" + takeTime + ", accuracy=" + accuracy + ", status=" + status
				+ ", totalTakeTime=" + totalTakeTime + "]";
	}

}
