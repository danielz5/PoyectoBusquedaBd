package com.edutecno.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "curso")
@Table(name = "curso")
public class Curso {
	
//	codigo_curso VARCHAR(30),
//	fecha_inicio DATE,
//	fecha_termno DATE,
//	codigo_comuna INT,
//	codigo_plan_formativo VARCHAR(30),
	@Id
	@Column(nullable = false, insertable = false, updatable = false)
	private String codigoCurso;
	
	private Date fechaInicio;
	private Date fechaTermno;
	@Column(nullable = false, insertable = false, updatable = false)
	private String codigoPlanFormativo;
	
	@ManyToOne
	@JoinColumn(name= "codigoPlanFormativo")
	private PlanFormativo planFormativo;
	
//	@OneToMany
//	@JoinColumn(name = "CodigoCurso")
//	private Collection<Estudiante> estudiante;

		
}
