package com.eta.jkm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eta.jkm.dao.InfoDao;
import com.eta.jkm.domain.InfoVO;

// 서비스 제공
@Service
public class InfoService {

	// dao 객체 생성 - dao에서 구현된 메소드로 서비스 제공
	private InfoDao infoDao;

	// 생성자를 통한 Autowired
	@Autowired
	public InfoService(InfoDao infoDao) {
		super();
		this.infoDao = infoDao;
	}
	
	public List<InfoVO> getInfos() {
		return infoDao.getInfos();
	}
	

	public InfoVO getInfo(Integer shipId) {
		return infoDao.getInfo(shipId);
	}
}
