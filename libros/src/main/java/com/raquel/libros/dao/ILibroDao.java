package com.raquel.libros.dao;

import org.springframework.data.repository.CrudRepository;

import com.raquel.libros.entity.Libro;

public interface ILibroDao extends CrudRepository<Libro,Long>{

}
