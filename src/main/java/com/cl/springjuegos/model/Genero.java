package com.cl.springjuegos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_genero;
	@Column
	private String nombre_genero;
	
	public int getId_genero() {
		return id_genero;
	}
	public void setId_genero(int id_genero) {
		this.id_genero = id_genero;
	}
	public String getNombre_genero() {
		return nombre_genero;
	}
	public void setNombre_genero(String nombre_genero) {
		this.nombre_genero = nombre_genero;
	}
	
	
}
