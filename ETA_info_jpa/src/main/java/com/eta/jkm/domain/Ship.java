package com.eta.jkm.domain;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity  // 객체 생성
@Inheritance(strategy = InheritanceType.JOINED)  // 매핑전략 지정(부모 클래스)
@DiscriminatorColumn
public class Ship {

	@Id  // 식별자 매핑
	private int shipId;
	private int shipCode;
	private String shipName;
	private String shipUse;

	// 기본 생성자
	public Ship() {

	}

	// 필드 생성자
	public Ship(int shipId, int shipCode, String shipName, String shipUse) {
		super();
		this.shipId = shipId;
		this.shipCode = shipCode;
		this.shipName = shipName;
		this.shipUse = shipUse;
	}

	@Override  // toString 오버라이딩
	public String toString() {
		return "Ship [shipId=" + shipId + ", shipCode=" + shipCode + ", shipName=" + shipName + ", shipUse=" + shipUse
				+ "]";
	}

	// 게터, 세터
	public int getShipId() {
		return shipId;
	}

	public void setShipId(int shipId) {
		this.shipId = shipId;
	}

	public int getShipCode() {
		return shipCode;
	}

	public void setShipCode(int shipCode) {
		this.shipCode = shipCode;
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
	
}
