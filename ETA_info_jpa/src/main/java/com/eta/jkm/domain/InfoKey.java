package com.eta.jkm.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class InfoKey {

	@ManyToOne
	@JoinColumn(name = "shipId")
	private Ship ship;
	
	@Column(nullable = false, columnDefinition = "DATETIME")
	private String insertTime;
	
	public InfoKey() {

	}

	public InfoKey(Ship ship, String insertTime) {
		super();
		this.ship = ship;
		this.insertTime = insertTime;
	}

	@Override
	public String toString() {
		return "InfoKey [ship=" + ship + ", insertTime=" + insertTime + "]";
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	public String getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}
	
}
