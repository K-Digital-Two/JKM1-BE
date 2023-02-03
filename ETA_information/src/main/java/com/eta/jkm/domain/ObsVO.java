package com.eta.jkm.domain;

public class ObsVO {

	private String obsId;
	private String obsName;
	private float obsLat;
	private float obsLon;
	
	public ObsVO() {

	}

	public ObsVO(String obsId, String obsName, float obsLat, float obsLon) {
		super();
		this.obsId = obsId;
		this.obsName = obsName;
		this.obsLat = obsLat;
		this.obsLon = obsLon;
	}

	@Override
	public String toString() {
		return "ObsVO [obsId=" + obsId + ", obsName=" + obsName + ", obsLat=" + obsLat + ", obsLon=" + obsLon + "]";
	}

	public String getObsId() {
		return obsId;
	}

	public void setObsId(String obsId) {
		this.obsId = obsId;
	}

	public String getObsName() {
		return obsName;
	}

	public void setObsName(String obsName) {
		this.obsName = obsName;
	}

	public float getObsLat() {
		return obsLat;
	}

	public void setObsLat(float obsLat) {
		this.obsLat = obsLat;
	}

	public float getObsLon() {
		return obsLon;
	}

	public void setObsLon(float obsLon) {
		this.obsLon = obsLon;
	}
	
}
