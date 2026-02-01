package com.uisrael.cursosapi.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.cursosapi.dominio.entidades.TipoCliente;

public interface ITipoClienteRepositorio {

	TipoCliente guardar(TipoCliente cliente);
	
	Optional<TipoCliente> buscarPorId(int id);
	
	List<TipoCliente> listarTodos();
	
	void eliminar(int id);
	
}
