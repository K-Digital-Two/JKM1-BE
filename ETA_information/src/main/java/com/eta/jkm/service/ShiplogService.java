package com.eta.jkm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eta.jkm.dao.ShiplogDao;
import com.eta.jkm.domain.ShiplogVO;

// 서비스 제공
@Service
public class ShiplogService {

	// dao 객체 생성 - dao에서 구현된 메소드로 서비스 제공
	private ShiplogDao dao;

	// 생성자를 통한 Autowired
	@Autowired
	public ShiplogService(ShiplogDao dao) {
		super();
		this.dao = dao;
	}
	
	public List<ShiplogVO> getLogs(Integer timeGroup) {
		return dao.getLogs(timeGroup);
	}
	

	public ShiplogVO getLog(Integer timeGroup, Integer shipId) {
		return dao.getLog(timeGroup, shipId);
	}
	
	public List<ShiplogVO> getLocations(Integer timeGroup) {
		return dao.getLocations(timeGroup);
	}
	
	public List<ShiplogVO> getLocations(Integer timeGroup, Integer shipId) {
		return dao.getLocations(timeGroup, shipId);
	}
}
