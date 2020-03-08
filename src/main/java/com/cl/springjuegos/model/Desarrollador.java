package com.cl.springjuegos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Desarrollador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_desarrollador;
	@Column
	private String nombre_desarrollador;
	
	public int getId_desarrollador() {
		return id_desarrollador;
	}
	public void setId_desarrollador(int id_desarrollador) {
		this.id_desarrollador = id_desarrollador;
	}
	public String getNombre_desarrollador() {
		return nombre_desarrollador;
	}
	public void setNombre_desarrollador(String nombre_desarrollador) {
		this.nombre_desarrollador = nombre_desarrollador;
	}
	
}
