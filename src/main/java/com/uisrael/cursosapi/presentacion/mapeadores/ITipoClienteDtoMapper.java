package com.uisrael.cursosapi.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.cursosapi.dominio.entidades.TipoCliente;
import com.uisrael.cursosapi.presentacion.dto.request.TipoClienteRequestDTO;
import com.uisrael.cursosapi.presentacion.dto.response.TipoClienteResponseDTO;

@Mapper(componentModel = "spring")
public interface ITipoClienteDtoMapper {

	TipoCliente toDomain(TipoClienteRequestDTO dto);
	
	TipoClienteResponseDTO toResponseDto(TipoCliente tipoCliente);
	
}
