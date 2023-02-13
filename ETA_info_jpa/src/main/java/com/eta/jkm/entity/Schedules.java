package com.eta.jkm.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity  // 객체 생성
public class Schedules {

	@EmbeddedId
	private SchedulesKey schedulesKey;
	private String departure;
	private String departTime;
	
	// 기본 생성자
	public Schedules() {

	}

	// 필드 생성자
	public Schedules(SchedulesKey schedulesKey, String departure, String departTime) {
		super();
		this.schedulesKey = schedulesKey;
		this.departure = departure;
		this.departTime = departTime;
	}

	@Override  // toString 오버라이딩
	public String toString() {
		return "Schedules [schedulesKey=" + schedulesKey + ", departure=" + departure + ", departTime=" + departTime
				+ "]";
	}

	// 게터, 세터
	public SchedulesKey getSchedulesKey() {
		return schedulesKey;
	}

	public void setSchedulesKey(SchedulesKey schedulesKey) {
		this.schedulesKey = schedulesKey;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDepartTime() {
		return departTime;
	}

	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}

}
