package com.cl.springjuegos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plataforma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_plataforma;
	@Column
	private String nombre_plataforma;
	
	public int getId_plataforma() {
		return id_plataforma;
	}
	public void setId_plataforma(int id_plataforma) {
		this.id_plataforma = id_plataforma;
	}
	public String getNombre_plataforma() {
		return nombre_plataforma;
	}
	public void setNombre_plataforma(String nombre_plataforma) {
		this.nombre_plataforma = nombre_plataforma;
	}
	
	
}
