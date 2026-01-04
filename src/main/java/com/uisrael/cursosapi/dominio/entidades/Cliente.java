package com.uisrael.cursosapi.dominio.entidades;

public final class Cliente {
	
	private final int id;
	private final String nombre;
	private final String apellido;
	private final String ci;
	private final String telefono;
	private final String direccion;
	private final boolean estado;
	
	public Cliente(int id, String nombre, String apellido, String ci, String telefono, String direccion,
			boolean estado) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.telefono = telefono;
		this.direccion = direccion;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getCi() {
		return ci;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public Boolean getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", ci=" + ci + ", telefono="
				+ telefono + ", direccion=" + direccion + ", estado=" + estado + "]";
	}
	
}
