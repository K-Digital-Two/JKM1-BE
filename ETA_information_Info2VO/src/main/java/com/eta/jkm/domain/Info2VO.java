package com.eta.jkm.domain;

public class Info2VO {

//	private int schedules_ship_shipId; // 선박 mmsi
	private double shipLat; // 선박 현재 위도
	private double shipLon; // 선박 현재 경도
	private int shipId;

	public Info2VO() {
	}

	public Info2VO(double shipLat, double shipLon, int shipId) {
		super();
		this.shipLat = shipLat;
		this.shipLon = shipLon;
		this.shipId = shipId;
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

	public int getShipId() {
		return shipId;
	}

	public void setShipId(int shipId) {
		this.shipId = shipId;
	}

	@Override
	public String toString() {
		return "Info2VO [shipLat=" + shipLat + ", shipLon=" + shipLon + ", shipId=" + shipId + "]";
	}

}
