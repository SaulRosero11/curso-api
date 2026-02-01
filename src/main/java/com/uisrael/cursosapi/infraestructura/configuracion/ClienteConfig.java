package com.uisrael.cursosapi.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.cursosapi.aplicacion.casosuso.entrada.IClienteCasoUso;
import com.uisrael.cursosapi.aplicacion.casosuso.entrada.ITipoClienteCasoUso;
import com.uisrael.cursosapi.aplicacion.casosuso.impl.ClienteCasoUsoImpl;
import com.uisrael.cursosapi.aplicacion.casosuso.impl.TipoClienteCasoUsoImpl;
import com.uisrael.cursosapi.dominio.repositorios.IClienteRepositorio;
import com.uisrael.cursosapi.dominio.repositorios.ITipoClienteRepositorio;
import com.uisrael.cursosapi.infraestructura.persistencia.adaptadores.ClienteRepositorioImpl;
import com.uisrael.cursosapi.infraestructura.persistencia.adaptadores.TipoClienteRepositorioImpl;
import com.uisrael.cursosapi.infraestructura.persistencia.mapeadores.IClienteJpaMapper;
import com.uisrael.cursosapi.infraestructura.persistencia.mapeadores.ITipoClienteJpaMapper;
import com.uisrael.cursosapi.infraestructura.respositorios.IClienteJpaRepositorio;
import com.uisrael.cursosapi.infraestructura.respositorios.ITipoClienteJpaRepositorio;

@Configuration
public class ClienteConfig {

	@Bean
	IClienteRepositorio clienteRepositorio(IClienteJpaRepositorio jpaRepository, IClienteJpaMapper mapper) {
	    return new ClienteRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	IClienteCasoUso clienteUseCase(IClienteRepositorio repositorio) {
	    return new ClienteCasoUsoImpl(repositorio);
	}

	@Bean
	ITipoClienteRepositorio tipoClienteRepositorio(ITipoClienteJpaRepositorio jpaRepository, ITipoClienteJpaMapper mapper) {
	    return new TipoClienteRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	ITipoClienteCasoUso tipoClienteUseCase(ITipoClienteRepositorio repositorio) {
	    return new TipoClienteCasoUsoImpl(repositorio);
	}
	
}
