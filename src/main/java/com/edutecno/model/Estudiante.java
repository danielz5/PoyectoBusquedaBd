package com.edutecno.model;

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
@Entity
@Table(name = "Estudiante")
public class Estudiante {
	
//	id_estudiante INT,
//	rut VARCHAR(15),
//	nombre VARCHAR(30),
//	apellido_pat VARCHAR(30),
//	apellido_mat VARCHAR(30),
//	direccion VARCHAR(100),
//	codigo_comuna INT,
//	codigo_curso VARCHAR(30),
//	CONSTRAINT pk_estudiante PRIMARY KEY (id_estudiante),
//	CONSTRAINT fk_estudiante_comuna FOREIGN KEY (codigo_comuna) REFERENCES comuna(codigo_comuna),
//	CONSTRAINT fk_estudiante_curso FOREIGN KEY (codigo_curso) REFERENCES curso(codigo_curso)
//);
	
	@Id
	private Integer idEstudiante;
	private String rut;
	private String nombre;
	private String apellidoPat;
	private String apellidoMat;
	private String direccion;
	@Column(nullable = false, insertable = false, updatable = false)
	private Integer codigoComuna;
	@Column(nullable = false, insertable = false, updatable = false)
	private String codigoCurso;

	@ManyToOne
	@JoinColumn(name = "codigoCurso")
	private Curso curso;
	
	@ManyToOne
	@JoinColumn(name = "codigoComuna")
	private Comuna comuna;
	
	
}
