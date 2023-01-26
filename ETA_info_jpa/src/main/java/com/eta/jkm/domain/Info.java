package com.eta.jkm.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity // 객체 생성
public class Info {

	@EmbeddedId
	private InfoKey infoKey;
	
	@Column(nullable = false)
	private float shipLat;
	
	@Column(nullable = false)
	private float shipLon;
	
	@Column(nullable = false)
	private float speed;
	
	@Column(nullable = false)
	private String arrivalTime;
	
	@Column(nullable = false)
	private int takeTime;
	
	@Column(nullable = false)
	private float accuracy;
	
	// 기본 생성자
	public Info() {

	}

	// 필드 생성자
	public Info(InfoKey infoKey, float shipLat, float shipLon, float speed, String arrivalTime, int takeTime,
			float accuracy) {
		super();
		this.infoKey = infoKey;
		this.shipLat = shipLat;
		this.shipLon = shipLon;
		this.speed = speed;
		this.arrivalTime = arrivalTime;
		this.takeTime = takeTime;
		this.accuracy = accuracy;
	}

	@Override  // toString 오버라이딩
	public String toString() {
		return "Info [infoKey=" + infoKey + ", shipLat=" + shipLat + ", shipLon=" + shipLon + ", speed=" + speed
				+ ", arrivalTime=" + arrivalTime + ", takeTime=" + takeTime + ", accuracy=" + accuracy + "]";
	}

	// 게터, 세터
	public InfoKey getInfoKey() {
		return infoKey;
	}

	public void setInfoKey(InfoKey infoKey) {
		this.infoKey = infoKey;
	}

	public float getShipLat() {
		return shipLat;
	}

	public void setShipLat(float shipLat) {
		this.shipLat = shipLat;
	}

	public float getShipLon() {
		return shipLon;
	}

	public void setShipLon(float shipLon) {
		this.shipLon = shipLon;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getTakeTime() {
		return takeTime;
	}

	public void setTakeTime(int takeTime) {
		this.takeTime = takeTime;
	}

	public float getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(float accuracy) {
		this.accuracy = accuracy;
	}
	
}
