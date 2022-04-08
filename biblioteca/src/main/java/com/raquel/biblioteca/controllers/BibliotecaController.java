package com.raquel.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.raquel.biblioteca.entity.Biblioteca;
import com.raquel.biblioteca.entity.Libro;
import com.raquel.biblioteca.services.BibliotecaService;

@RestController
public class BibliotecaController {
	@Autowired
	private BibliotecaService bibliotecaService;
	
	@GetMapping("/listar")
	public List<Biblioteca> listar(){
		return bibliotecaService.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Biblioteca mostrarLibro(@PathVariable Long id) {
		return bibliotecaService.findById(id);
	}
}
