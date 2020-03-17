package com.cl.springjuegos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl.springjuegos.model.Genero;
import com.cl.springjuegos.repository.GeneroRepo;

@Service
public class GeneroService {

	@Autowired
	private GeneroRepo repository;
	
	public List<Genero> getAll(){
		List<Genero> lista = new ArrayList<>();
		lista = (List<Genero>) repository.findAll();
		return lista;
	}
}
