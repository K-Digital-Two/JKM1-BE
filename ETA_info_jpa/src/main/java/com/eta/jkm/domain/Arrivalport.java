package com.eta.jkm.domain;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity  // 객체 생성
@Inheritance(strategy = InheritanceType.JOINED)  // 매핑전략 지정(부모 클래스)
@DiscriminatorColumn
public class Arrivalport {

	@Id  // 식별자 매핑
	private String arrivalName;
	private float arrivalLat;
	private float arrivalLon;
	
	// 기본 생성자
	public Arrivalport() {

	}
	
	// 필드 생성자
	public Arrivalport(String arrivalName, float arrivalLat, float arrivalLon) {
		this.arrivalName = arrivalName;
		this.arrivalLat = arrivalLat;
		this.arrivalLon = arrivalLon;
	}

	@Override  // toString 오버라이딩
	public String toString() {
		return "ArrivalPort [arrivalName=" + arrivalName + ", arrivalLat=" + arrivalLat + ", arrivalLon=" + arrivalLon
				+ "]";
	}

	// 게터, 세터
	public String getArrivalName() {
		return arrivalName;
	}

	public void setArrivalName(String arrivalName) {
		this.arrivalName = arrivalName;
	}

	public float getArrivalLat() {
		return arrivalLat;
	}

	public void setArrivalLat(float arrivalLat) {
		this.arrivalLat = arrivalLat;
	}

	public float getArrivalLon() {
		return arrivalLon;
	}

	public void setArrivalLon(float arrivalLon) {
		this.arrivalLon = arrivalLon;
	}
	
}
