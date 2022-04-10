package com.raquel.biblioteca.dao;

import org.springframework.data.repository.CrudRepository;

import com.raquel.biblioteca.entity.Biblioteca;

public interface IBibliotecaDao extends CrudRepository<Biblioteca,Long>{
}
