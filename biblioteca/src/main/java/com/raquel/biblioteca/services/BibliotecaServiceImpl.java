package com.raquel.biblioteca.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.raquel.biblioteca.entity.Biblioteca;
import com.raquel.biblioteca.entity.Libro;


@Service("serviceRestTemplate")
public class BibliotecaServiceImpl implements BibliotecaService {
	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Biblioteca> findAll() {
		return  Arrays.asList(clienteRest.getForObject("http://servicio-biblioteca/listar", Biblioteca[].class));
		
	}

	@Override
	public Biblioteca findById(Long id) {
		return null;
	}

}
