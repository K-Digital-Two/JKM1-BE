package com.eta.jkm.domain;

import java.util.Date;

public class SchedulesVO {
	private int num; // 항목번호
	private int ship_shipId; // 선박 MMSI
	private String arrivalPort_arrivalName; // 도착지
	private String departure; // 출발지
	private Date departTime; // 출발시각

	public SchedulesVO() {
	}

	public SchedulesVO(int num, int ship_shipId, String arrivalPort_arrivalName, String departure, Date departTime) {
		super();
		this.num = num;
		this.ship_shipId = ship_shipId;
		this.arrivalPort_arrivalName = arrivalPort_arrivalName;
		this.departure = departure;
		this.departTime = departTime;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getShip_shipId() {
		return ship_shipId;
	}

	public void setShip_shipId(int ship_shipId) {
		this.ship_shipId = ship_shipId;
	}

	public String getArrivalPort_arrivalName() {
		return arrivalPort_arrivalName;
	}

	public void setArrivalPort_arrivalName(String arrivalPort_arrivalName) {
		this.arrivalPort_arrivalName = arrivalPort_arrivalName;
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

	@Override
	public String toString() {
		return "SchedulesVO [num=" + num + ", ship_shipId=" + ship_shipId + ", arrivalPort_arrivalName="
				+ arrivalPort_arrivalName + ", departure=" + departure + ", departTime=" + departTime + "]";
	}

}
