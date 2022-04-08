package com.raquel.libros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.raquel.libros.Services.ILibroService;
import com.raquel.libros.entity.Libro;

@RestController
public class LibroController {
	@Autowired
	private ILibroService libroService;
	
	@GetMapping("/listar")
	public List<Libro> listar(){
		return libroService.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Libro mostrarLibro(@PathVariable Long id) {
		return libroService.findById(id);
	}
}
