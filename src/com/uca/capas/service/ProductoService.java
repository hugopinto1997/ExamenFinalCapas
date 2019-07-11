package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Producto;

public interface ProductoService {
	public List<Producto> findAll() throws DataAccessException;
	public Producto findOne(Integer id) throws DataAccessException;
}
