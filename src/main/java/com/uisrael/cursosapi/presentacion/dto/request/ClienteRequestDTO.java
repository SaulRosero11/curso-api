package com.uisrael.cursosapi.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClienteRequestDTO {

	//private int id;
	
	@NotBlank
	private String nombre;
	@NotBlank
	private String apellido;
	@NotBlank
	private String ci;
	@NotBlank
	private String telefono;
	@NotBlank
	private String direccion;
	
	private boolean estado;
	
}
