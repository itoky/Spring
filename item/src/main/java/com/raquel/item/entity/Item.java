package com.raquel.item.entity;

public class Item {
	private Libro libro;
	private Integer cantidad;

	public Item() {

	}

	public Item(Libro libro, Integer cantidad) {
		this.libro = libro;
		this.cantidad = cantidad;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getTotal() {
		return libro.getPrecio() * cantidad.intValue();
	}

}
