package com.cl.springjuegos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Juego {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_juego;
	@Column
	private String nombre_juego;
	@Column
	private String fecha_juego;
	@Column
	private String imagen_juego;
	@Column
	private int precio_juego;
	@OneToOne
	@JoinColumn(name = "fk_desarrollador", referencedColumnName = "id_desarrollador")
	private Desarrollador desarrollador;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "juego")
    private List<Genero> genero;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "juego")
	private List<Plataforma> plataforma;
	
	
	public int getId_juego() {
		return id_juego;
	}
	public void setId_juego(int id_juego) {
		this.id_juego = id_juego;
	}
	public String getNombre_juego() {
		return nombre_juego;
	}
	public void setNombre_juego(String nombre_juego) {
		this.nombre_juego = nombre_juego;
	}
	public String getFecha_juego() {
		return fecha_juego;
	}
	public void setFecha_juego(String fecha_juego) {
		this.fecha_juego = fecha_juego;
	}
	public String getImagen_juego() {
		return imagen_juego;
	}
	public void setImagen_juego(String imagen_juego) {
		this.imagen_juego = imagen_juego;
	}
	public int getPrecio_juego() {
		return precio_juego;
	}
	public void setPrecio_juego(int precio_juego) {
		this.precio_juego = precio_juego;
	}
	public Desarrollador getDesarrollador() {
		return desarrollador;
	}
	public void setDesarrollador(Desarrollador desarrollador) {
		this.desarrollador = desarrollador;
	}
	public List<Genero> getGenero() {
		return genero;
	}
	public void setGenero(List<Genero> genero) {
		this.genero = genero;
	}
	public List<Plataforma> getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(List<Plataforma> plataforma) {
		this.plataforma = plataforma;
	}
	
	
}
