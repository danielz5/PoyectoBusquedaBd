package com.edutecno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edutecno.model.Region;
import com.edutecno.repository.RegionRepository;

@Service
public class RegionServiceImp implements RegionService {
	
	@Autowired
	private RegionRepository regionRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Region> findAll() {
		return regionRepository.findAll();
	}

}
