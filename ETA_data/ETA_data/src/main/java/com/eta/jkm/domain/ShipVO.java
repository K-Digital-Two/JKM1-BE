package com.eta.jkm.domain;

public class ShipVO {
	private int shipId; // 선박 MMSI
	private String shipCode; // 현재 선박 위도
	private String shipName; // 현재 선박 경도
	private String shipUse; // 선박 속도

	public ShipVO() {
	}

	public ShipVO(int shipId, String shipCode, String shipName, String shipUse) {
		super();
		this.shipId = shipId;
		this.shipCode = shipCode;
		this.shipName = shipName;
		this.shipUse = shipUse;
	}

	public int getShipId() {
		return shipId;
	}

	public void setShipId(int shipId) {
		this.shipId = shipId;
	}

	public String getShipCode() {
		return shipCode;
	}

	public void setShipCode(String shipCode) {
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

	@Override
	public String toString() {
		return "ShipVO [shipId=" + shipId + ", shipCode=" + shipCode + ", shipName=" + shipName + ", shipUse=" + shipUse
				+ "]";
	}

}
