package com.raquel.libros.Services;

import java.util.List;

import com.raquel.libros.entity.Libro;

public interface ILibroService {
	public List<Libro> findAll();
	public Libro findById(Long id);
	
}
