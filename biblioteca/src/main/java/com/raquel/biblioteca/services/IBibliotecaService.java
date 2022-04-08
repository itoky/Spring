package com.raquel.biblioteca.services;

import java.util.List;

import com.raquel.biblioteca.entity.Biblioteca;
import com.raquel.biblioteca.entity.Libro;

public interface IBibliotecaService {
	public  List<Biblioteca> findAll();
	public Biblioteca findById(Long id);
}
