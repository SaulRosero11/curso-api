package com.uisrael.cursosapi.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.cursosapi.dominio.entidades.Cliente;
import com.uisrael.cursosapi.presentacion.dto.request.ClienteRequestDTO;
import com.uisrael.cursosapi.presentacion.dto.response.ClienteResponseDTO;

@Mapper(componentModel = "spring")
public interface IClienteDtoMapper {

	Cliente toDomain(ClienteRequestDTO dto);
	
	ClienteResponseDTO toResponseDto(Cliente cliente);
	
}
