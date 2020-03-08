package com.cl.springjuegos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Genero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_genero;
	@Column
	private String nombre_genero;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_juego")
    private Juego juego;
}
