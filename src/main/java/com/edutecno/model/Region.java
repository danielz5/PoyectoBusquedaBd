package com.edutecno.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Region {

//	CREATE TABLE Region(
//			codigo_region INT,
//			nombre VARCHAR(30),
	
	@Id
	private Integer codigoRegion;
	private String nombre;
}
