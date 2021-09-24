package com.empresa.service;

import java.util.List;

import com.empresa.entity.Disponibilidad;

public interface DisponibilidadService {
	
	public abstract List<Disponibilidad> listaDisponibilidad();

	public abstract Disponibilidad insertaActualizaDisponibilidad(Disponibilidad obj);
}
