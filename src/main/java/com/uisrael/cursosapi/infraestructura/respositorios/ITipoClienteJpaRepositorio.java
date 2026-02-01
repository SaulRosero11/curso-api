package com.uisrael.cursosapi.infraestructura.respositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursosapi.infraestructura.persistencia.jpa.TipoClienteJpa;

public interface ITipoClienteJpaRepositorio extends JpaRepository<TipoClienteJpa, Integer> {

}
