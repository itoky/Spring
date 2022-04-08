package com.raquel.item.services;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.raquel.item.entity.Item;
import com.raquel.item.entity.Libro;

@Service("serviceRestTemplate")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Item> findAll() {
		List<Libro> libros = Arrays.asList(clienteRest.getForObject("http://servicio-libros/listar", Libro[].class));
		return libros.stream().map(l -> new Item(l, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		Map<String, String> pathVariables = new HashMap<String,String>();
		pathVariables.put("id", id.toString());
		Libro libro = clienteRest.getForObject("http://localhost:8001/listar/{id}", Libro.class, pathVariables);
		/*Libro libro = new Libro();
		libro.setEditado(new Date());
		libro.setId(id);
		libro.setNombre("Libro");
		libro.setPrecio(21.2); */
		return new Item(libro,cantidad);
	}

}
