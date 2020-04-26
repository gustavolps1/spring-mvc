package com.app.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.agenda.model.Evento;
import com.app.agenda.repository.EventoRepository;

@Controller
public class EventoController {

	@Autowired
	private EventoRepository eventoRepository;
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public String cadastrarEventoView() {
		return "evento/formEvento";
	}
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public String cadastrarEventoForm(Evento evento) {
		eventoRepository.save(evento);
		return "redirect:/cadastrarEvento";
	}
}
