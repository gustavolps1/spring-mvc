package com.app.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.agenda.model.Evento;
import com.app.agenda.repository.EventoRepository;

@Controller
public class IndexController {

	@Autowired
	private EventoRepository eventoRepository;

	@RequestMapping(value = "/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Evento> eventos = eventoRepository.findAll();
		mv.addObject("eventos", eventos);
		return mv;
		
	}
}
