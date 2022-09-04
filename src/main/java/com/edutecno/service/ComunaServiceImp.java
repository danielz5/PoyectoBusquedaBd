package com.edutecno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edutecno.model.Comuna;
import com.edutecno.repository.ComunaRepository;

@Service
public class ComunaServiceImp implements ComunaService {
	
	@Autowired
	private ComunaRepository comunaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Comuna> findAllComuna() {
		return comunaRepository.findAll();
	}

}
