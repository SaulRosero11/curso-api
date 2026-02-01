package com.uisrael.cursosapi.aplicacion.casosuso.impl;

import java.util.List;

import com.uisrael.cursosapi.aplicacion.casosuso.entrada.ITipoClienteCasoUso;
import com.uisrael.cursosapi.dominio.entidades.TipoCliente;
import com.uisrael.cursosapi.dominio.repositorios.ITipoClienteRepositorio;

public class TipoClienteCasoUsoImpl implements ITipoClienteCasoUso {

	private final ITipoClienteRepositorio repositorio;
	
	public TipoClienteCasoUsoImpl(ITipoClienteRepositorio repositorio) {
		
		this.repositorio = repositorio;
	}

	@Override
	public TipoCliente crear(TipoCliente cliente) {
		// TODO Auto-generated method stub
		return repositorio.guardar(cliente);
	}

	@Override
	public TipoCliente obtenerPorId(int id) {
		// TODO Auto-generated method stub
		return repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<TipoCliente> listar() {
		// TODO Auto-generated method stub
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		repositorio.eliminar(id);
	}

	
	
}
