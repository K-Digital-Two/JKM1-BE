package com.eta.jkm.domain;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class SchedulesKey {

	@ManyToOne
	@JoinColumn(name = "shipId")
	private Ship ship;
	
	@JoinColumn(name = "arrivalName")
	private Arrivalport arrivalport;

}
