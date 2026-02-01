package com.uisrael.cursosapi.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.cursosapi.dominio.entidades.Cliente;
import com.uisrael.cursosapi.infraestructura.persistencia.jpa.ClienteJpa;

@Mapper(componentModel = "string")
public interface IClienteJpaMapper {

	Cliente toDomain(ClienteJpa entity);
	
	ClienteJpa toEntity(Cliente cliente);
	
}
