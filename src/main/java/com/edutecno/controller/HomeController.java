package com.edutecno.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.edutecno.model.Estudiante;
import com.edutecno.service.CursoService;
import com.edutecno.service.EstudianteService;
import com.edutecno.service.PlanFormativoService;
import com.edutecno.service.RegionService;

@Controller
@RequestMapping({"/","/estudiantes"})
public class HomeController {

	@Autowired
	private EstudianteService estudianteService;
	@Autowired
	private CursoService cursoService;
	@Autowired
	private PlanFormativoService planFormativoService;
	@Autowired
	private RegionService regioService;

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("estudiantes");
		modelAndView.addObject("estudiante", estudianteService.findAllEstudiante());
		modelAndView.addObject("region", regioService.findAll());
		modelAndView.addObject("curso", cursoService.findAllCurso());
		modelAndView.addObject("planFormativo", planFormativoService.findAll());
		return modelAndView;

	}

	@PostMapping("/filtrante")
	public ModelAndView home(@RequestParam("codigoRegion") Integer codigoRegion,
			@RequestParam("codigoPlanFormativo") String cpf) {
		System.out.println(codigoRegion + cpf);
		ModelAndView modelAndView = new ModelAndView("estudiantes");
		List<Estudiante> data = new ArrayList<Estudiante>();
		for (Estudiante estudianteTemp : estudianteService.findAllEstudiante()) {
			if (estudianteTemp.getComuna().getCodigoRegion() == codigoRegion
					&& estudianteTemp.getCurso().getCodigoPlanFormativo().equals(cpf)) {
				data.add(estudianteTemp);
			}
		}
		modelAndView.addObject("region", regioService.findAll());
		modelAndView.addObject("planFormativo", planFormativoService.findAll());
		System.out.println(data);
		modelAndView.addObject("estudiante", data);
		return modelAndView;
	}
}