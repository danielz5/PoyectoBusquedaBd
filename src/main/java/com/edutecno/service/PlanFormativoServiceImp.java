package com.edutecno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edutecno.model.Curso;
import com.edutecno.model.PlanFormativo;
import com.edutecno.repository.PlanFormativoRepository;

@Service
public class PlanFormativoServiceImp implements PlanFormativoService {
	
	@Autowired
	private PlanFormativoRepository planformativoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<PlanFormativo> findAll() {
		return planformativoRepository.findAll();
	}

//	@Override
//	@Transactional(readOnly = true)
//	public List<PlanFormativo> findByCodigoPlanFormativo(String codigoCurso) {
//		return planformativoRepository.findByCodigoPlanFormativo(codigoCurso);
//	}



}
