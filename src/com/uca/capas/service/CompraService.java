package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Compra;
import com.uca.capas.dto.CompraDTO;

public interface CompraService {
	public List<Compra> findAll() throws DataAccessException;
	public List<Compra> findComprasXCliente(Integer id) throws DataAccessException;
	public void insertar(CompraDTO c) throws DataAccessException;
}
