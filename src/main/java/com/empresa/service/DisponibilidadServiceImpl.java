package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.empresa.entity.Disponibilidad;
import com.empresa.repository.DisponibilidadRepository;


public class DisponibilidadServiceImpl implements DisponibilidadService{

	@Autowired
	private DisponibilidadRepository repositorio;
	
	@Override
	public List<Disponibilidad> listaDisponibilidad() {
		
		return repositorio.findAll();
	}

	@Override
	public Disponibilidad insertaActualizaDisponibilidad(Disponibilidad obj) {
		return repositorio.save(obj);
	}

}
