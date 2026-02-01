package com.uisrael.cursosapi.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.cursosapi.dominio.entidades.TipoCliente;
import com.uisrael.cursosapi.dominio.repositorios.ITipoClienteRepositorio;
import com.uisrael.cursosapi.infraestructura.persistencia.jpa.TipoClienteJpa;
import com.uisrael.cursosapi.infraestructura.persistencia.mapeadores.ITipoClienteJpaMapper;
import com.uisrael.cursosapi.infraestructura.respositorios.ITipoClienteJpaRepositorio;

public class TipoClienteRepositorioImpl implements ITipoClienteRepositorio {

	private final ITipoClienteJpaRepositorio jpaRepositorio;
	private final ITipoClienteJpaMapper entityMapper;
	
	public TipoClienteRepositorioImpl(ITipoClienteJpaRepositorio jpaRepositorio, ITipoClienteJpaMapper entityMapper) {
		
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public TipoCliente guardar(TipoCliente cliente) {
		// TODO Auto-generated method stub
		TipoClienteJpa entity = entityMapper.toEntity(cliente);
		TipoClienteJpa guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<TipoCliente> buscarPorId(int id) {
		// TODO Auto-generated method stub
		return jpaRepositorio.findById(id).map(entityMapper::toDomain);
	}

	@Override
	public List<TipoCliente> listarTodos() {
		// TODO Auto-generated method stub
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		jpaRepositorio.deleteById(id);
	}

}
