package com.cl.springjuegos.repository;

import org.springframework.data.repository.CrudRepository;

import com.cl.springjuegos.model.Juego;

public interface JuegoRepository extends CrudRepository<Juego,Integer> {

}
