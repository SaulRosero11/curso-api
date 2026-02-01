package com.uisrael.cursosapi.infraestructura.respositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursosapi.infraestructura.persistencia.jpa.ClienteJpa;

public interface IClienteRepositorio extends JpaRepository<ClienteJpa, Integer> {

	
	
}
