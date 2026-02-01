package com.uisrael.cursosapi.aplicacion.casosuso.entrada;

import java.util.List;
import java.util.Optional;

import com.uisrael.cursosapi.dominio.entidades.TipoCliente;

public interface ITipoClienteCasoUso {

	TipoCliente crear(TipoCliente cliente);
	
	TipoCliente obtenerPorId(int id);
	
	List<TipoCliente> listar();
	
	void eliminar(int id);
	
}
