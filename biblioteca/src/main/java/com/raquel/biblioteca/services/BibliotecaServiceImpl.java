package com.raquel.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raquel.biblioteca.dao.IBibliotecaDao;
import com.raquel.biblioteca.entity.Biblioteca;


@Service("serviceRestTemplate")
public class BibliotecaServiceImpl implements IBibliotecaService {
	@Autowired
	private IBibliotecaDao bibliotecaDAO;

	@Override
	public List<Biblioteca> findAll() {
		return (List<Biblioteca>) bibliotecaDAO.findAll();
		
	}

	@Override
	public Biblioteca findById(Long id) {
		return bibliotecaDAO.findById(id).orElse(null);
	}

}
