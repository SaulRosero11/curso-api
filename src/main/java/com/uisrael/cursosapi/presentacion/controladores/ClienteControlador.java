package com.uisrael.cursosapi.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.cursosapi.aplicacion.casosuso.entrada.IClienteCasoUso;
import com.uisrael.cursosapi.presentacion.dto.request.ClienteRequestDTO;
import com.uisrael.cursosapi.presentacion.dto.response.ClienteResponseDTO;
import com.uisrael.cursosapi.presentacion.mapeadores.IClienteDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/clientes")
public class ClienteControlador {
	
	private final IClienteCasoUso clienteCasoUso;
	private final IClienteDtoMapper mapper;
	
	public ClienteControlador(IClienteCasoUso clienteCasoUso, IClienteDtoMapper mapper) {
		
		this.clienteCasoUso = clienteCasoUso;
		this.mapper = mapper;
	}
	
	@GetMapping
	public List<ClienteResponseDTO> listar() {
		return clienteCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}
		
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ClienteResponseDTO crear(@Valid @RequestBody ClienteRequestDTO request) {
		
		return mapper.toResponseDto(clienteCasoUso.crear(mapper.toDomain(request)));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int id){
		
		clienteCasoUso.eliminar(id);
		return ResponseEntity.noContent().build();
	}
}
