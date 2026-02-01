package com.uisrael.cursosapi.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.cursosapi.dominio.entidades.Cliente;
import com.uisrael.cursosapi.dominio.repositorios.IClienteRepositorio;
import com.uisrael.cursosapi.infraestructura.persistencia.jpa.ClienteJpa;
import com.uisrael.cursosapi.infraestructura.persistencia.mapeadores.IClienteJpaMapper;
import com.uisrael.cursosapi.infraestructura.respositorios.IClienteJpaRepositorio;

public class ClienteRepositorioImpl implements IClienteRepositorio{

	// Dependencias
	private final IClienteJpaRepositorio jpaRepositorio;
	private final IClienteJpaMapper entityMapper;
		
	public ClienteRepositorioImpl(IClienteJpaRepositorio jpaRepositorio, IClienteJpaMapper entityMapper) {
		
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Cliente guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		ClienteJpa entity = entityMapper.toEntity(cliente);
		ClienteJpa guardado = jpaRepositorio.save(entity);		
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Cliente> buscarPorId(int id) {
		// TODO Auto-generated method stub
		return jpaRepositorio.findById(id).map(entityMapper::toDomain);
	}

	@Override
	public List<Cliente> listarTodos() {
		// TODO Auto-generated method stub
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		jpaRepositorio.deleteById(id);
	}	
	
}
