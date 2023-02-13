package com.eta.jkm.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eta.jkm.dto.ShiplogDTO;

public interface InfosRepository extends JpaRepository<ShiplogDTO, Integer>{

	
	
}
