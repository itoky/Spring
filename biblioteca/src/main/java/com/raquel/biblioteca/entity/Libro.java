package com.raquel.biblioteca.entity;

import java.util.Date;

public class Libro {

	private Long id;

	private String nombre;
	private Double precio;

	private Date editado;

	public Libro() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getEditado() {
		return editado;
	}

	public void setEditado(Date editado) {
		this.editado = editado;
	}

}
