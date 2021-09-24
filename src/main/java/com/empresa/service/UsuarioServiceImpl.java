package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.empresa.entity.Usuario;

import com.empresa.repository.UsuarioRepository;

public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repositorio;
	
	@Override
	public List<Usuario> listaUsuario() {
		return repositorio.findAll();
	}

}
