package com.eta.jkm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.eta.jkm.dao.ObsDAO;
import com.eta.jkm.dao.ShiplogDAO;
import com.eta.jkm.domain.ObsVO;
import com.eta.jkm.domain.ShiplogVO;

// 서비스 제공
@Service
public class ShiplogService {

	// dao 객체 생성 - dao에서 구현된 메소드로 서비스 제공
	private ShiplogDAO slDao;
	private ObsDAO obsDao;

	// 생성자를 통한 Autowired
	@Autowired
	public ShiplogService(
			@Qualifier("shiplogDao") ShiplogDAO slDao,
			@Qualifier("ObsDao") ObsDAO obsDao) {
		this.slDao = slDao;
		this.obsDao = obsDao;
	}
	
	public List<ShiplogVO> getLogs(Integer timeGroup) {
		return slDao.getLogs(timeGroup);
	}
	

	public ShiplogVO getLog(Integer timeGroup, Integer shipId) {
		return slDao.getLog(timeGroup, shipId);
	}
	
	public List<ShiplogVO> getLocations(Integer timeGroup) {
		return slDao.getLocations(timeGroup);
	}
	
	public ShiplogVO getLocations(Integer timeGroup, Integer shipId) {
		return slDao.getLocations(timeGroup, shipId);
	}
	
	public List<ObsVO> getObs() {
		return obsDao.getObs();
	}
}
