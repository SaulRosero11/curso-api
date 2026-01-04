package com.uisrael.cursosapi.dominio.entidades;

public final class TipoCliente {
	
	private final int id;
	private final String nombre;
	private final String descripcion;
	private final boolean estado; // true: activo - false: eliminado
	
	public TipoCliente(int id, String nombre, String descripcion, boolean estado) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public boolean isEstado() {
		return estado;
	}
	
	
}
