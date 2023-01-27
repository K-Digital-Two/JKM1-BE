package com.eta.jkm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.eta.jkm.domain.Info2VO;
import com.eta.jkm.domain.InfoVO;
import com.eta.jkm.service.InfoService;

// 웹 브라우저를 통한 요청 받아들이기
@RestController
public class InfoController {

	// service 객체 생성
	private InfoService infoService;
	private static final Logger log = LoggerFactory.getLogger(InfoController.class);

	// field 생성자
	@Autowired
	public InfoController(InfoService infoService) {
		log.info("InfoController() 생성자가 호출됨");
		this.infoService = infoService;
	}

	// db에 저장된 정보를 보여주는 기능이므로 GetMapping만 사용
	@GetMapping("/info")
	public List<InfoVO> getDetails() {
		log.info("InfoController - getInfos()가 호출됨");
		return infoService.getInfos();
	}

	@GetMapping("/info/{shipId}")
	public InfoVO getDetail(@PathVariable Integer shipId) {
		log.info(String.format("InfoController - getInfo(%d)가 호출됨", shipId));
		return infoService.getInfo(shipId);
	}

	@GetMapping("/info2")
	public List<Info2VO> getDetails2() {
		log.info("InfoController - getInfos2()가 호출됨");
		return infoService.getInfos2();
	}

	@GetMapping("/info2/{shipId}")
	public List<Info2VO> getDetail2(@PathVariable Integer shipId) {
		log.info(String.format("InfoController - getInfo2(%d)가 호출됨", shipId));
		return infoService.getInfo2(shipId);
	}

}
