package com.raquel.libros.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "libros")
public class Libro implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;

	private String nombre;
	private Double precio;
	
	//@Column(name="anyo_edicion")
	@Temporal(TemporalType.DATE)
	private Date editado;

	public Libro() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
