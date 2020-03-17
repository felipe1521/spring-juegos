package com.cl.springjuegos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl.springjuegos.model.Plataforma;
import com.cl.springjuegos.repository.PlataformaRepo;

@Service
public class PlataformaService {

	@Autowired
	private PlataformaRepo repository;
	
	public List<Plataforma> getAll(){
		List<Plataforma> lista = new ArrayList<>();
		lista = (List<Plataforma>) repository.findAll();
		return lista;
	}
}
