package com.cl.springjuegos.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.cl.springjuegos.model.Juego;
import com.cl.springjuegos.service.DesarrolladorService;
import com.cl.springjuegos.service.JuegoService;

@Controller
public class JuegoController {

	@Autowired
	private JuegoService service;
	
	@Autowired
	private DesarrolladorService Dservice;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/list")
	public String index(Model model) {
		List<Juego> juegos = service.getAll();
		model.addAttribute("lista", juegos);
		return "list";
	}
	
	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("juego", new Juego());
		model.addAttribute("devs", Dservice.getAll());
		return "save";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") int id, Model model) {
		Juego juego = service.getById(id);
		model.addAttribute("juego", juego);
		model.addAttribute("devs", Dservice.getAll());
		return "edit";
	}
	 
	@PostMapping("/save")
	public String saving(@RequestParam("imagen") MultipartFile file,@Valid Juego juego, Model model) {
		if(file != null) {
			service.save(juego,file);
		}else {
			service.edit(juego);
		}
		return "redirect:/list";
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id, Model model) {
		service.delete(id);
		return "redirect:/list";
	}
	
	
}
