package com.uisrael.cursosapi.aplicacion.casosuso.impl;

import java.util.List;
import java.util.Optional;

import com.uisrael.cursosapi.aplicacion.casosuso.entrada.IClienteCasoUso;
import com.uisrael.cursosapi.dominio.entidades.Cliente;
import com.uisrael.cursosapi.dominio.repositorios.IClienteRepositorio;

public class ClienteCasoUsoImpl implements IClienteCasoUso{

	private final IClienteRepositorio repositorio;
	
	public ClienteCasoUsoImpl(IClienteRepositorio repositorio) {
		
		this.repositorio = repositorio;
	}

	@Override
	public Cliente crear(Cliente cliente) {
		// TODO Auto-generated method stub
		return repositorio.guardar(cliente);
	}
	
	@Override
	public Cliente obtenerPorId(int id) {
		// TODO Auto-generated method stub
		return repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		repositorio.eliminar(id);
	}

}
