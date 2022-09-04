package com.edutecno.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="planFormativo")
@Table(name="planFormativo")
public class PlanFormativo {

//	CREATE TABLE Plan_Formativo(
//			codigo_plan_formativo VARCHAR(30),
//			descripcion VARCHAR(250),
//			duracion_horas INT,
//			CONSTRAINT pk_plan_formativo PRIMARY KEY (codigo_plan_formativo)
//		);
	@Id
	private String codigoPlanFormativo;
	private String descripcion;
	private Integer duracionHoras;
	
	
}
