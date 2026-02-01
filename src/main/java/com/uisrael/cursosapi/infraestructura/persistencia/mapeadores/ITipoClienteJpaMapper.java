package com.uisrael.cursosapi.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.cursosapi.dominio.entidades.TipoCliente;
import com.uisrael.cursosapi.infraestructura.persistencia.jpa.TipoClienteJpa;

@Mapper(componentModel = "spring")
public interface ITipoClienteJpaMapper {

	TipoCliente toDomain (TipoClienteJpa entity);
	
	TipoClienteJpa toEntity (TipoCliente cliente);
}
