package com.app.agenda.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.agenda.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, Long>{
	Evento findByCodigo(long codigo);
}
