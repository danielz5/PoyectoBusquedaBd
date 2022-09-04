package com.edutecno.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edutecno.model.Curso;
import com.edutecno.repository.CursoRepository;

@Service
public class CursoServiceImp implements CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Curso> findAllCurso() {		
		return cursoRepository.findAll();
	}

}
