package com.edutecno.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Comuna {
	
//	CREATE TABLE Comuna(
//			codigo_comuna INT,
//			nombre VARCHAR(30),
//			codigo_region INT,

	@Id
	private Integer codigoComuna;
	
	private String nombre;
	@Column(nullable = false, insertable = false, updatable = false)
	private Integer codigoRegion;
	
	@ManyToOne
	@JoinColumn(name = "codigoRegion")
	private Region region;
	
}
