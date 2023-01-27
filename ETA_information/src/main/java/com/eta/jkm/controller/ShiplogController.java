package com.eta.jkm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.eta.jkm.domain.ShiplogVO;
import com.eta.jkm.service.ShiplogService;

// 웹 브라우저를 통한 요청 받아들이기
@RestController
public class ShiplogController {

	// service 객체 생성
	private ShiplogService shiplogService;
	private static final Logger log = LoggerFactory.getLogger(ShiplogController.class);
	
	// field 생성자
	@Autowired
	public ShiplogController(ShiplogService shiplogService) {
		log.info("ShiplogController() 생성자가 호출됨");
		this.shiplogService = shiplogService;
	}

	// db에 저장된 정보를 보여주는 기능이므로 GetMapping만 사용
	@GetMapping("/log")
	public List<ShiplogVO> getDetails() {
		log.info("ShiplogController - getLogs()가 호출됨");
		return shiplogService.getInfos();
	}
	
	@GetMapping("/log/{shipId}")
	public ShiplogVO getDetail(@PathVariable Integer shipId) {
		log.info(String.format("ShiplogController - getLog(%d)가 호출됨", shipId));
		return shiplogService.getInfo(shipId);
	}
	
	@GetMapping("/locations")
	public List<ShiplogVO> getLocations() {
		log.info("ShiplogController - getLocations(%d)가 호출됨");
		return shiplogService.getLocations();
	}
}
