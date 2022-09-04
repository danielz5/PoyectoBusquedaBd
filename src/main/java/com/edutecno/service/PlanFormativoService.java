package com.edutecno.service;

import java.util.List;

import com.edutecno.model.Curso;
import com.edutecno.model.PlanFormativo;

public interface PlanFormativoService {
	
	public List<PlanFormativo> findAll();
	//public List<PlanFormativo> findByCodigoPlanFormativo(String codigoCurso);

}
