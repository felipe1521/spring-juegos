package com.cl.springjuegos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl.springjuegos.model.Desarrollador;
import com.cl.springjuegos.repository.DesarrolladorRepo;

@Service
public class DesarrolladorService {

	@Autowired
	private DesarrolladorRepo repository;
	
	public List<Desarrollador> getAll(){
		List<Desarrollador> lista = new ArrayList<>();
		repository.findAll().forEach(var -> lista.add(var));
		return lista;
	}
}
