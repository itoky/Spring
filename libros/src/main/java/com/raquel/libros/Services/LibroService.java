	package com.raquel.libros.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raquel.libros.dao.ILibroDao;
import com.raquel.libros.entity.Libro;

@Service
public class LibroService implements ILibroService{

	@Autowired
	private ILibroDao libroDAO;
	
	@Override
	public List<Libro> findAll() {
		return (List<Libro>) libroDAO.findAll();
	}

	@Override
	public Libro findById(Long id) {
		return libroDAO.findById(id).orElse(null);
	}

}
