package com.edutecno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edutecno.model.Estudiante;
import com.edutecno.repository.EstudianteRepository;

@Service
public class EstudianteServiceImp implements EstudianteService {
	
	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Estudiante> findAllEstudiante() {
		return estudianteRepository.findAll();
	}

}
