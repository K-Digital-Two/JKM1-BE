package com.eta.jkm.domain;

public class ArrivalportVO {
	private String arrivalName; // 도착지
	private double arrivalLat; // 도착지 위도
	private double arrivalLon; // 도착지 경도

	public ArrivalportVO() {
	}

	public ArrivalportVO(String arrivalName, double arrivalLat, double arrivalLon) {
		super();
		this.arrivalName = arrivalName;
		this.arrivalLat = arrivalLat;
		this.arrivalLon = arrivalLon;
	}

	public String getArrivalName() {
		return arrivalName;
	}

	public void setArrivalName(String arrivalName) {
		this.arrivalName = arrivalName;
	}

	public double getArrivalLat() {
		return arrivalLat;
	}

	public void setArrivalLat(double arrivalLat) {
		this.arrivalLat = arrivalLat;
	}

	public double getArrivalLon() {
		return arrivalLon;
	}

	public void setArrivalLon(double arrivalLon) {
		this.arrivalLon = arrivalLon;
	}

	@Override
	public String toString() {
		return "ArrivalportVO [arrivalName=" + arrivalName + ", arrivalLat=" + arrivalLat + ", arrivalLon=" + arrivalLon
				+ "]";
	}

}
